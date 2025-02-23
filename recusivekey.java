package oops;

public class recusivekey {
    public static   void keys(int[] arr, int key,int i){
       // int i=0;
        if (arr[i] != key) {
            keys(arr, key,i+1);
        } else {
            System.out.println(i);
            return;
        }

    }
    public static void main(String[] args) {
        int [] arr={1,2,4,6,5};
        int i=0;
        int key =6;

       /*
          for (i=0;i< arr.length;i++){
            if (arr[i]==key){
              System.out.println(i+" "+arr[i]);
               }
         }
         */
        keys(arr,key,i);
       // System.out.println(i);

    }
}
