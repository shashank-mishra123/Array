package oops;

public class sum_array_indext {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        //
        int sum_even_id=0;
                // for even index
        int odd_index=0;
        for (int i=1;i<arr.length;i++){
            if (i%2==1){
                sum_even_id+=arr[i];
            }
            else {
                odd_index+=arr[i];
            }
        }
        System.out.println(" sum of even index " +sum_even_id);
        System.out.println(" sum of odd index " +odd_index);
        int deff=sum_even_id-odd_index;
        System.out.println(" deffernce = " +deff);
    }
    // for defferences
}
