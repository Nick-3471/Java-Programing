package Smith_Nick.Learning;

public class Looping {
    public static void main(String[] args) {
/*      System.out.println(caclulateInterest(10000.0, 2.0));
    
        for(int i=0; i<12; i++)
        {
            System.out.println(caclulateInterest(10000.0, i));
        } */

        /* int primeCount = 0;
        for(int i = 0; i <100; i++){
            if(isPrime(i)){
                System.out.println(i + " Is a prime number.");
                primeCount +=1;
            }
        }
        System.out.println("Total Prime Numbers: " + primeCount); */

/*      int total = 0;
        int count = 0;
        for(int i =1; i <= 1000; i++){
            if((i % 3 == 0) && (i%5==0)){
                System.out.println(i + " is devisible by both 3 & 5");
                total = total + i;
                count +=1;
                
                if(count == 5){
                    break;
                }
            }
        }
        System.out.println(total); */

        int number= 4;
        int finishNumber =20;
        int evenNumberCount = 0;

        while (number <=finishNumber){
            number++;
            if(!isEven(number))
                continue;
            
            System.out.println("Even Number: " + number);
            evenNumberCount +=1;
            if(evenNumberCount == 5)
                break;
        }
        System.out.println("Total number of Even numbers: " + evenNumberCount);

    }

    public static boolean isEven(int Number) {
        if(Number %2 == 0 )
            return true;
        
        return false;
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
    }

    public static double caclulateInterest(double amount, double interestRate) {
        
        return amount * (interestRate/100.0) ;
    }
}