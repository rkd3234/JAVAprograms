// Find out the second largest element of the given array. Numbers=[5,3,9,7,4,1,8]


import java.util.Arrays;
public class SecondLarge{


    public static int getSecondLargest(int[] a, int total) {


        Arrays.sort(a);


        return a[total - 2]; }


    public static void main(String args[]) {


        int a[] = {5,3,9,7,4,1,8};


        System.out.println("Second Largest: " + getSecondLargest(a, 7));
    }
}

