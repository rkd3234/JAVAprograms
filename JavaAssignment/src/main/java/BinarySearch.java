// Write a program that will find your key is found in the given array using binary search method
// numbers=[1,6,9,3,5,4,7]
// key=5


import java.util.Arrays;
public class BinarySearch {


    public static void main(String args[]) {
        

        int [] arr = new int [] {1,6,9,3,5,4,7};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }


        int Key = 5;
        System.out.println("Given Key = " + Key);
        System.out.println(Key + " is found at index = " + Arrays.binarySearch(arr, Key));


    }


}

