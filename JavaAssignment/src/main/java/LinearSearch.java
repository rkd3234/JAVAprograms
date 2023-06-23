// Write a program that will find your key is found in the given array using linear search method
// numbers=[1,6,9,3,5,4,7]
// key=5


public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String a[]) {
        int[] a1 = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;
        System.out.println("Given Key = " + key);
        System.out.println(key + " is found at index: " + linearSearch(a1, key));
    }
}