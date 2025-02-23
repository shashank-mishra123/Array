package oops;

import java.util.Scanner;

public class stackiImp {
     public static int push(int i,int [] arr)
     {
         int top=-1;
         if (top== arr.length-1)
         {
             System.out.println("stack overflow");
         }
         else {
             top++;
             arr[++top]=i;
             System.out.println(arr[top]);
         }

         return 0;
     }
    public static void main(String[] args) {
       int  []arr= {0,0,0,0,0,0};
        int top=-1;
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        while (c.equals("yes"))
        {
            int n= sc.nextInt();
            System.out.println(" enter the number ");
            switch(n)
            {
                case 1: {
                    System.out.println("enter the element array");
                    int i = sc.nextInt();
                    int d=  push(i,arr);
                    break;
                }
              //  case 2:
                //{
                  //  pop();
                    //break;
               // }
                //case 3:
              //  {
                    //displa();
                   // break;
               // }
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
