package Smith_Nick.Chapter7;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigit(1));
    }

    public static int sumDigit(int Value) {
        if(Value < 10)
            return -1;
        
        int sum = 0;

        while (true) {
            sum += (Value %10);
            Value = Value/10;

            if(Value < 10){
                sum += Value;
                break;
            }
        }
        return sum;
    }
}