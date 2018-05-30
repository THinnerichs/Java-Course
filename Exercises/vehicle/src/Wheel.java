public class Wheel {
    public static final String COLOR_BLACK = "Black";
    public static final String COLOR_WHITE  = "White";

    private int max_pressure = 100;
    private  int size = 10;
    private String color = COLOR_BLACK;
    private int pressure = 0;

    public Wheel(int size, int pressure, int max_pressure, String color) {
        this.size = size;
        this.pressure = pressure;
        this.max_pressure = max_pressure;
        this.color = color;
    }

    public int getPressure() {
        return pressure;
    }

    public int getMaxPressure() {
        return max_pressure;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }


    public void pumpUp() {
        if(pressure < max_pressure) {
            pressure += 1;
        }
    }
}
