package Smith_Nick;

public class Car extends Vehicle{
    private int wheels;
    private int doors;


    public Car(String name, int wheels, int doors) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
    }

    public void steer(){

    }

    public void shiftUp(){

    }

    public void shiftDown(){

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
