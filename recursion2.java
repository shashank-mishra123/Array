package oops;

public class recursion2 {
     public static void  printNsum(int n ,int v,int sum){
         if (n==v){
             sum+=n;
             System.out.println(sum);
             return;
         }
         sum+=n;
         printNsum(1+n,v,sum);

    }
    public static void main(String[] args) {
         int n=1;
         int val=5;
         int sum=0;
         printNsum(1,5,0);
    }
}
