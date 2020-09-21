package Smith_Nick.Ch8;

import java.sql.SQLOutput;

class Vehicle {
    private String name;
    private int doors;
    private int wheels;
    private Boolean engine;

    public Vehicle(String name, int doors) {
        this.name = name;
        this.doors = doors;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        this.engine = true;
        return "Turning on the Engine";
    }

    public String accelerate(){
        return "Speeding up";
    }

    public String brake(){
        return "Slowing down";
    }

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public Boolean getEngine() {
        return engine;
    }
}

class Tesla extends Vehicle{
    public Tesla() {
        super("Tesla" , 4);
    }

    @Override
    public String  startEngine() {
        return "Turning on electric engine";
    }

}
class Ford extends Vehicle{
    public Ford() {
        super("Ford" , 3);
    }

    @Override
    public String accelerate() {
        return "Going super fast";
    }
}
class Acura extends Vehicle{
    public Acura() {
        super("Acura" , 4);
    }

    @Override
    public String brake() {
        return "Hard Breaks";
    }
}



    public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie Number " + i + ":"
                    + movie.getName() + "\n"
                    + "Plot: " + movie.plot() + "\n");

        }
        for (int i = 0; i < 11; i++) {
            Vehicle vehicle = randomCar();
            System.out.println("Car Number " + i + ": "
                    + vehicle.getName() + "\n"
                    + "Engine: " + vehicle.startEngine() + "\n"
                    + "Accelerate: " + vehicle.accelerate() + "\n"
                    + "Break: " + vehicle.brake() + "\n");

        }

       /* Dimensions theDimentions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", theDimentions );
        Monitor theMonitor = new Monitor("X27", "Acer", 27, new Resolution(3840, 2160));
        Motherboard theMotherboard = new Motherboard("Model #", "Gigabyte", 4, 5, "v2.44" );

        PC myPC = new PC(theCase, theMonitor, theMotherboard);

       // myPC.getTheMonitor().drawPixelAt(1,2,"red");*/
    }

    //Polymorphism
    public static Movie randomMovie () {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("This is the random Number " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new MazeRunner();
            case 3:
                return new StarWars();
            case 4:
                return new IndependenceDay();
            case 5:
                return new ForgetableMovie();
        }
        return null;
    }

    public static Vehicle randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("This is the random Number " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Tesla();
            case 2:
                return new Ford();
            case 3:
                return new Acura();
        }
        return null;
    }

}




































class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No Plot Here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "Shark eats people";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids escape a maze";
    }

}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Jedi being Jedi";
    }

}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attack the world";
    }

}

class ForgetableMovie extends Movie{
    public ForgetableMovie() {
        super("ForgetableMovie");
    }

    //No Plot method
    }







