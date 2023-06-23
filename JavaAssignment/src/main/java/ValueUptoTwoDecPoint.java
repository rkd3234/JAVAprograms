
// Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52
public class ValueUptoTwoDecPoint {

    public static void main(String[] args) {


        double a = 15.5276;
        System.out.println("Given value: " + a);


        double b = Math.floor(a * 100) / 100;
        System.out.println("Value upto 2 decimal point: " + b);
    }
}

