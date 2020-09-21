package Smith_Nick.Chapter7;

public class Acura extends Car{
    private int display;
    private int seats;

    public Acura(String name, int wheels, int doors, int display, int seats) {
        super(name, wheels, doors);
        this.display = display;
        this.seats = seats;
    }



    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
