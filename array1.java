package oops;

public class array1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int product=1;
        for (int i=0;i<n;i++){
            product*=arr[i];
        }
        // enhance loop for product
        System.out.println(product);
    }
}
