// Write a program that will take integer numbers as user input continuously
// and print the sum of numbers until user input q from the keyboard.
// When user input q, program will be quit. If user inputs another character,
// then the program will ask to input the number again.

import java.util.Scanner;

class SumAfterQuit
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number or enter q to quit:- \n");


        int sum = 0;
        while(true){
            String input = sc.nextLine();
            if(input.equals("q")){
                break;
            }
            int number = Integer.parseInt(input);
            sum+=number;
        }
        System.out.println("Sum of numbers: "+ sum);

    }
}

