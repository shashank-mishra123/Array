 package oops;

import java.util.Scanner;
// greatest common divisor factor//
public class Hcf {
   static int hcf(int num,int num2)
   {
       int i=2;
       int d=0;
       while(num%i==0 && num2%i==0)
       {
           d=i;
           i++;
       }
       return d;
   }
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int num2= sc.nextInt();
        int d=hcf(num,num2);
        System.out.println(d);
        // lcm//
        int lcm=(num*num2)/d;
        System.out.println(lcm);
    }
}
