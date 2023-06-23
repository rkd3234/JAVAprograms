// Find out the duplicate numbers in the given array and in which position they are found.
//numbers=[1,2,3,1,2,4,5,6,4]

public class DuplicateNumbers {
    public static void main(String[] args) {

        int [] arr = new int [] {1,2,3,1,2,4,5,6,4};

        System.out.println("Duplicate numbers in this array: ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);


            }
        }
    }
}

