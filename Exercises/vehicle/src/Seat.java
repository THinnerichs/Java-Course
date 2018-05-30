public class Seat {
    private boolean occupied = false;

    public boolean isOccupied() {
        return occupied;
    }

    public void Sit() {
        occupied = true;
    }

    public void StandUp() {
        occupied = false;
    }
}
