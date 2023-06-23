//Write a program that will shuffle (values will randomly change their position) from the given array. Numbers=[1,2,3,4,5,6,7,8,9,0]

import java.util.Arrays;
import java.util.Random;
public class Shuffle {


    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Given array = "+Arrays.toString(arr));
        Random rand = new Random();
        for(int i = 0; i < arr.length; ++i) {
            int index = rand.nextInt(arr.length - i);
            int tmp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[index];
            arr[index] = tmp;
        }
        System.out.println("Shuffled array = "+Arrays.toString(arr));
    }
}
