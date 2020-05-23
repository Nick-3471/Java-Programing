package Smith_Nick.Learning;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int min = 0;
         int max = 0;
         int value = 0;
         boolean temp = true;
         System.out.println("Enter Number:");
        while (scanner.hasNextInt()) {
            value = scanner.nextInt();
            if(temp){
                min = max = value;
                temp = false;
            }
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
            System.out.println("Enter Number:");
        }
        System.out.println("This is the Min Value: " + min);
        System.out.println("This is the Max Value: " + max);





        /* System.out.println("Enter you Name: ");
        String name = scanner.nextLine(); 

        System.out.println("Enter you Birth Year: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int birthYear = scanner.nextInt();
         
            if(birthYear >= 1990 && birthYear <= 2020){
               //System.out.println("Your name is " + name);
               System.out.println("Your Birth Year is " + (2020 - birthYear));
            }
            else
               System.out.println("Invalid Birth Year");
   
   

        }
        else
            System.out.println("Invalid Birth Year"); */




/* //Read 10 Numbers from user input
        Scanner scanner2 = new Scanner(System.in);

        int n = 0;
        int sum = 0;
        int value = 0;
        while (n<3) {
            System.out.println("Enter Number");
            if(scanner2.hasNextInt()){
                n++;
                sum += scanner2.nextInt();

            }
            else{
                System.out.println("Not a number");
                
            }

        }
        System.out.println("The sum of all the numbers you have entered is: " + sum);
        scanner2.close();*/
        scanner.close();
    } 
}