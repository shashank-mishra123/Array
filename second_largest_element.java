package oops;

public class second_largest_element {
    public static void main(String[] args) {
        int[] arr = {1, 10, 3, 9,11};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(arr[1]);
        /*
        second largest element
        for (int i=0;i< arr.length-1;i++)
        System.out.println();
       */


    }
}
