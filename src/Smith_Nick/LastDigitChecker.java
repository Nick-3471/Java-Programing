/* Write a method named hasSameLastDigit with three parameters of type int. 
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

EXAMPLE INPUT/OUTPUT:
* hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
* hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
* hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000

Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

EXAMPLE INPUT/OUTPUT
* isValid(10); → should return true since 10 is within the range of 10-1000
* isValid(468); → should return true since 468 is within the range of 10-1000
* isValid(1051); → should return false since 1051 is not within the range of 10-1000

NOTE: All methods need to be defined as public static as we have been doing so far in the course.
NOTE: Do not add a main method to the solution code. */
package Smith_Nick;

public class LastDigitChecker {
    public static void main(String[] args) {
        
    }

    public static boolean hasSameLastDigit(int ValueOne, int ValueTwo, int ValueThree) {
        if(!isValid(ValueOne) || !isValid(ValueTwo) || !isValid(ValueThree))
            return false;

        if(ValueOne %10 == ValueTwo %10)
            return true;
        if(ValueOne %10 == ValueThree %10)
            return true;
        if(ValueTwo %10 == ValueThree %10)
            return true;

        return false;
    }

    public static boolean isValid(int value){
        if(value < 10 || value > 1000)
            return false;
        
        return true;
    }
}

//Cool way of doing this
/*     public static boolean hasSameLastDigit(int a, int b, int c)
    {
        if (isValid(a) && isValid(b) && isValid(c))
        {
            a %= 10;
            b %= 10;
            c %= 10;
            return ((a == b) || (b == c) || (a == c));
        }
        return false;
    }

    public static boolean isValid(int a)
    {
        return ((a >= 10) && (a <= 1000));
    } */