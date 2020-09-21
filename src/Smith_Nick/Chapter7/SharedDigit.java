/* Write a method named hasSharedDigit with two parameters of type int. 
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code. */
package Smith_Nick.Chapter7;

public class SharedDigit {
    public static void main(String[] args) {
        if(hasSharedDigit(12, 43))
            System.out.println("Has sim vaulesf");
    }

    public static boolean hasSharedDigit(int valueOne, int valueTwo) {
        if(valueOne < 10 || valueOne > 99)
            return false;
        if(valueTwo < 10 || valueTwo > 99)
            return false;

        int firstDigitValOne = valueOne %10;
        int secondDigitValOne = valueOne /10;
        int firstDigitValTwo = valueTwo %10;
        int secondDigitValTwo = valueTwo /10;

        if(firstDigitValOne == firstDigitValTwo || firstDigitValOne == secondDigitValTwo)
            return true;
        else if(secondDigitValOne == firstDigitValTwo || secondDigitValOne == secondDigitValTwo)
            return true;
        
        return false;
    }


}