package oops;

import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0};
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the position");
        int pos=sc.nextInt();
        System.out.println(" enter the value");
        int val= sc.nextInt();
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++){
               if (i==pos)
                // enter the value
                {
                    if (arr[i]==0)
                    {
                        arr[i]=val;
                        break;
                    }
                    else {
                        System.out.println(" element already exits");
                    }
                }
               // else {
                 //   System.out.println(" out of limit ");
                //}
            }
        }
        for (int q:arr){
            System.out.println(q);
        }
    }
}
