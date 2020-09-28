package Smith_Nick.Ch8;

import java.util.Scanner;

class Burger2 {
    private String pattyType;
    private String bunType;
    private int toppingAmount;
    private double pattyCost;
    private double toppingCostTotal;

    public Burger2(int menuItem) {
        if (menuItem == 1)
        {
            this.pattyType = "Beef Patty";
            this.bunType = "Sesame Seed Bun";
            this.toppingAmount = 4;
            this.pattyCost = 3.99;
            this.toppingCostTotal = 0;
        }

        if (menuItem == 2)
        {
            this.pattyType = "Turkey Patty";
            this.bunType = "Whole Wheat Bun";
            this.toppingAmount = 6;
            this.pattyCost = 4.99;
            this.toppingCostTotal = 0;
        }
        if (menuItem == 3)
        {
            this.pattyType = "Deluexe Patty";
            this.bunType = "Sesame Seed Bun";
            this.toppingAmount = 0;
            this.pattyCost = 6.99;
            this.toppingCostTotal = 0;
        }

    }

    public void toppingChoices() {
        if (toppingAmount > 0) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Would you like Lettuce");
            if (userInput.hasNext()) {
                if (userInput.nextLine().toLowerCase().equals("yes")) {
                    toppingCostTotal += .50;
                }
            }

            System.out.println("Would you like Tomato");
            if (userInput.hasNext()) {
                if (userInput.nextLine().toLowerCase().equals("yes")) {
                    toppingCostTotal += .50;
                }
            }

            System.out.println("Would you like Onion");
            if (userInput.hasNext()) {
                if (userInput.nextLine().toLowerCase().equals("yes")) {
                    toppingCostTotal += .50;
                }
            }

            System.out.println("Would you like Cheese");
            if (userInput.hasNext()) {
                if (userInput.nextLine().toLowerCase().equals("yes")) {
                    toppingCostTotal += 1;
                }
            }

            if (toppingAmount == 6) {
                System.out.println("Would you like Bacon");
                if (userInput.hasNext()) {
                    if (userInput.nextLine().toLowerCase().equals("yes")) {
                        toppingCostTotal += 1.50;
                    }
                }
            }
        }
        else if (toppingAmount == 0)
            System.out.println("You will get Chips and a Drink with this order");
    }

    public double totalPrice(){
        return pattyCost + toppingCostTotal;
    }
}




public class MasterMain2 {
    public static void main(String[] args) {

        //User Selects Burger Type
        System.out.println("Please Select Either:" + "\n"  + " 1: Beef Burger" + "\n"
                                                            + " 2: Turkey Burger"+ "\n"
                                                            + " 3: Deluxe Burger" + "\n");

        Scanner userInput = new Scanner(System.in);
        int menuItem =  userInput.nextInt();
        while (menuItem != 1 && menuItem != 2 && menuItem != 3)
        {
            System.out.println("Please select a Number between 1-3");
            menuItem =  userInput.nextInt();
        }

        Burger2 customerOrder = new Burger2(menuItem);
        System.out.println("Would you like additional toppings? ");

        if(userInput.hasNext())
        {
            if (userInput.next().toLowerCase().equals("yes")) {
                customerOrder.toppingChoices();
            }
        }
        System.out.println("Your Total is: $" + customerOrder.totalPrice());
    }
}
