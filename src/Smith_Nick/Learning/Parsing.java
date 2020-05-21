package Smith_Nick.Learning;

public class Parsing {
    public static void main(String[] args) {
        String numberAString = "2018.125";
        System.out.println("Number As String = " + numberAString);

        double number = Double.parseDouble(numberAString);
        System.out.println("Number = "+ number);

        numberAString +=1;
        number +=1;

        System.out.println("Number As String = " + numberAString);
        System.out.println("Number = "+ number);
    }

}