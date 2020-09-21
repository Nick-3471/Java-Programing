/* Write a method named getLargestPrime with one parameter of type int named number. 
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.


EXAMPLE INPUT/OUTPUT:
* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
* getLargestPrime (0); should return -1 since 0 does not have any prime numbers
* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
* getLargestPrime (-1); should return -1 since the parameter is negative

HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code. */
package Smith_Nick.Chapter7;

public class LargestPrime {
    public static void main(final String[] args) {
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(final int value) {
        if(value < 2)
            return -1;
        
        int largetsPrime = 0;
        boolean isPrime = true;
        for (int i = 1; i <= value; i++) {
            if(value % i == 0){
                for (int j = 2; j<= i/2; j++){
                    if(i%j == 0){ 
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                    largetsPrime = i;
            }
        }
        return largetsPrime;
    }

/*     public static int getLargestPrime(int value){
        if(value < 2)
            return -1;
        
        int largetsPrime = 0;
        for (int i = 1; i < value; i++) {
            if(value % i == 0){
                if(isPrime(i))
                    largetsPrime = i;
            }
        }
        return largetsPrime;
    }





    public static boolean isPrime(int n) {
        if(n == 1){
            return false;
        }
        for (int i = 2; i<= n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    } */

/*     public static void printFactors(int value) {
        if(value > 0){
            for (int i = 1; i < value + 1; i++) {
                if(value % i == 0)
                System.out.println(i);
            }
        }
        else
        System.out.println("Invalid Value");
    } */
}