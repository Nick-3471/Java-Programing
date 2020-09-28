package Smith_Nick.Ch8;

import java.util.Scanner;

class Burger {
    protected String pattyType;
    protected String bunType;
    protected int toppingAmount;
    protected double pattyCost;
    protected double toppingCostTotal;

    public Burger(String pattyType) {
        this.pattyType = pattyType;
        this.bunType = "Sesame Seed Bun";
        this.toppingAmount = 4;
        this.pattyCost = 3.99;
        this.toppingCostTotal = 0;
    }

    public void toppingChoices(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like Lettuce");
        if(userInput.hasNext()) {
            if (userInput.nextLine().toLowerCase().equals("yes")) {
                toppingCostTotal += .50;
            }
        }

        System.out.println("Would you like Tomato");
        if(userInput.hasNext()) {
            if (userInput.nextLine().toLowerCase().equals("yes")) {
                toppingCostTotal += .50;
            }
        }

        System.out.println("Would you like Onion");
        if(userInput.hasNext()) {
            if (userInput.nextLine().toLowerCase().equals("yes")) {
                toppingCostTotal += .50;
            }
        }

        System.out.println("Would you like Cheese");
        if(userInput.hasNext()) {
            if (userInput.nextLine().toLowerCase().equals("yes")) {
                toppingCostTotal += 1;
            }
        }
    }

    public double totalPrice(){
        return pattyCost + toppingCostTotal;
    }
}

class TurkeyBurger extends Burger{
    public TurkeyBurger(String pattyType) {
        super(pattyType);
        this.bunType = "Whole Wheat Bun";
        this.toppingAmount = 6;
        this.pattyCost = 4.99;
        this.toppingCostTotal = 0;
    }

    @Override
    public void toppingChoices() {
        super.toppingChoices();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like Bacon");
        if(userInput.hasNext()) {
            if (userInput.nextLine().toLowerCase().equals("yes")) {
                toppingCostTotal += 1.50;
            }
        }
    }
}

class DeluxeBurger extends Burger{
    public DeluxeBurger(String pattyType) {
        super(pattyType);
        this.toppingAmount = 0;
        this.pattyCost = 6.99;
    }

    @Override
    public void toppingChoices() {
        System.out.println("You will get Chips and a Drink with this order");
    }
}

public class MasterMain {
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



        if(menuItem == 1)
        {
            Burger customerOrder = new Burger("Beef Burger");
            System.out.println("Would you like additional toppings? ");

            if(userInput.hasNext())
            {
               if (userInput.next().toLowerCase().equals("yes")) {
                    customerOrder.toppingChoices();
                }
            }
            System.out.println("Your Total is: $" + customerOrder.totalPrice());
        }


        else if(menuItem == 2)
        {
            TurkeyBurger customerOrder = new TurkeyBurger("Turkey Burger");
            System.out.println("Would you like additional toppings? ");
            if(userInput.hasNext())
            {
                if (userInput.next().toLowerCase().equals("yes")) {
                    customerOrder.toppingChoices();
                }
            }
            System.out.println("Your Total is: $" + customerOrder.totalPrice());
        }
        else
        {
            DeluxeBurger customerOrder = new DeluxeBurger("Deluxe Burger");
            System.out.println("Would you like additional toppings? ");

            if(userInput.hasNext())
            {
                if (userInput.next().toLowerCase().equals("yes")) {
                    customerOrder.toppingChoices();
                }
            }
            System.out.println("Your Total is: $" + customerOrder.totalPrice());
        }


    userInput.close();


        //Report out price
    }
}

