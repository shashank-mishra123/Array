package oops;

public class minimum_value_array {
    public static void main(String[] args) {
        int [] arr={197,90,89,96,34,35};

        int n= arr.length;
        int mini=arr[0];

        for (int i = 1; i<n; i++)
        {
            if(arr[i]<mini)
            {
                mini=arr[i];
            }
        }
        System.out.println(mini);
    }
}
