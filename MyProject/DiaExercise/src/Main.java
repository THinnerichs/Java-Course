public class Main {
    public static void main(String[] args) {
        int size  = 7; //max = star * 2 + 1

        int max = size * 2 + 1;

        for(int i = 0; i < size; i++) {
            int stars = i * 2 + 1;
            int spaces = max - stars / 2;
            String line = getSpaces(spaces) + getStars(stars);
            System.out.println(line);
        }
        for(int i = size; i >= 0; i--) {
            int stars = i * 2 + 1;
            int spaces = max - stars / 2;
            String line = getSpaces(spaces) + getStars(stars);
            System.out.println(line);
        }

    }

    public static String getStars(int size) {
        String stars = "";
        for(int i = 0; i < size; i++) {
            stars += "*";
        }
        return stars;
    }

    public static String getSpaces(int size) {
        String spaces = "";
        for(int i = 0; i < size; i++) {
            spaces += " ";
        }
        return spaces;
    }


}
