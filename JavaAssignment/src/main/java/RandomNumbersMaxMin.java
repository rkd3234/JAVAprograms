// Generate random 10 integer numbers in an array and print out all the numbers from array and also print the max and min number from the array


import java.util.Random;
public class RandomNumbersMaxMin {


    public static void main(String[] args) {
        int[] val = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Random numbers array...");
        for (int i = 0; i < val.length; i++) {
            val[i] = new Random().nextInt(100);
            System.out.println(val[i]);
        }
        for (int i = 0; i < val.length; i++) {
            if (val[i] < min)
                min = val[i];
            if (val[i] > max)
                max = val[i];
        }
        System.out.println("Min number = " + min);
        System.out.println("Max number = " + max);
    }
}
