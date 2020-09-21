package Smith_Nick.Ch8;



public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerButton()
    {
        System.out.println("Power Button Pressed");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public void setDimension(Dimensions dimension) {
        this.dimension = dimension;
    }
}
