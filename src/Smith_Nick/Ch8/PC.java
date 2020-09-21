package Smith_Nick.Ch8;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }


    public void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        getTheMonitor().drawPixelAt(100,50, "yellow");
    }

    private Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }

    public void setTheMonitor(Monitor theMonitor) {
        this.theMonitor = theMonitor;
    }

    private Motherboard getTheMotherboard() {
        return theMotherboard;
    }

    public void setTheMotherboard(Motherboard theMotherboard) {
        this.theMotherboard = theMotherboard;
    }
}
