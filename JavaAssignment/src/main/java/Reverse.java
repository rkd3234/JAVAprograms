// Take any number as input and print the reverse of the number
//input: 12345
//output: 54321

import java.util.Scanner;
public class Reverse {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number= sc.nextInt();
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}

