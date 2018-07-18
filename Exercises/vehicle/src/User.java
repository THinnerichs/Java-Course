import java.io.Serializable;

public class User implements Serializable{
    public String username;
    public String password;
    public boolean isLoggedIn = false;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return username + ";" + password;
    }
}
