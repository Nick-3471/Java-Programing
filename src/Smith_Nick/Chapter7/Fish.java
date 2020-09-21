package Smith_Nick.Chapter7;

public class Fish extends Animal {
    private int eyes;
    private int fins;
    private int gills;

    public Fish(String name, int size, int weight, int eyes, int fins, int gills) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.fins = fins;
        this.gills = gills;
    }

    public void rest(){
        System.out.println("Calling this function");
    }

    private void swim(){
        
    }
}