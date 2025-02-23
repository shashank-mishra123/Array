package oops;

public class recusion_binarysearch {
    public static int  binary(int arr[],int target,int start ,int end)
    {
        int mid =0;
        mid =(end+(end - start))/2;
        if (arr[mid]==target) {
            return mid;
        }
        else if(arr[mid]<target)
            return binary(arr,target,mid+1,end);
        else if (arr[mid]>target)
            return binary(arr,target,start,mid-1);
        else return -1;

    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int start=0;
        int end =arr.length-1;
        int mid=0;
        int target=5;
        int r1=binary(arr,target,start,end);
        System.out.println(r1);

    }
}
