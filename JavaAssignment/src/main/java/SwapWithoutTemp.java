// Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10

public class SwapWithoutTemp {

    public static void main(String x[])
    {
        int a = 10;
        int b = 20;


        System.out.println("Before Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


