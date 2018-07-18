import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AuthenticationSystem {

    private List<User> users;

    AuthenticationSystem() {
        users = new ArrayList<>();
    }

    public boolean login(String username, String password) {
        for(User user : users) {
            if(user.username.equals(username) && user.password.equals(password)) {
                user.isLoggedIn = true;
                return true;
            }
        }
        return false;
    }

    public void logout(String username) {
        for(User user : users) {
            if(user.username.equals(username)) {
                user.isLoggedIn = false;
            }
        }
    }

    public void register(String username, String password) {
        for(User user : users) {
            if(user.username.equals(username)) {
                throw new IllegalArgumentException("Username is taken");
            }
        }
        users.add(new User(username, password));
    }

    public void save(String path) {
        FileOutputStream outputStream = null;

        try {
            //write data
            outputStream = new FileOutputStream(path);

            for(User user : users) {
                outputStream.write((user.toString() + "\n").getBytes());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void load(String path) {
        FileInputStream fstream = null;
        BufferedReader bufferedReader = null;

        try {
            fstream = new FileInputStream(path);
            bufferedReader = new BufferedReader(new InputStreamReader(fstream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] userString = line.split(";");
                users.add(new User(userString[0], userString[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if(fstream != null)
                    fstream.close();

                if(bufferedReader != null)
                    bufferedReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveObjs(String path) {
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            outputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(outputStream);

            for(User user : users) {
                objectOutputStream.writeObject(user);
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(outputStream != null) {
                    outputStream.close();
                }
                if(objectOutputStream != null) {
                    objectOutputStream.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void loadObjs(String path, int amount) {
        FileInputStream inputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            inputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(inputStream);

            while (amount > 0) {
                users.add((User)objectInputStream.readObject());
                amount--;
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(inputStream != null) {
                    inputStream.close();
                }
                if(objectInputStream != null) {
                    objectInputStream.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
