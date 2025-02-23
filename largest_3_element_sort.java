package oops;

public class largest_3_element_sort {
    public static void main(String[] args) {
        int [] arr={5,3,50,493,1};
        // array sort
        int n= arr.length;
        for (int j=0;j<n;j++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        // for enhance loop
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        // three element//
        System.out.println("largest 3 element ");
        for (int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
    }
}
