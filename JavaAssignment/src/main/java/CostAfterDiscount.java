// A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price]

import java.util.*;
class CostAfterDiscount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("A core i 7 laptop price is: ");
        int num1 = in.nextInt();

        System.out.print("a gaming mouse price is: ");
        int num2 = in.nextInt();

        int sum = num1+num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);

        System.out.print("Discount: ");
        int discount = in.nextInt();

        int newval = 0;
        newval = (sum * discount / 100);
        System.out.println(sum + " x " + discount + " / " + 100 + " = " + newval);

        int price = 0;
        price = sum - newval;

        System.out.println(sum + " - " + newval + " = " + price);
        System.out.println("Total cost after 15% discount: " + price);
    }
}

