package oops;

import java.util.Scanner;

public class Aromgstrong {

   static int amogst(int num){
        int d=0;int sum=0;
        while (num!=0){
            d=num%10;
            num = num/10;
            sum=sum+(d*d*d);
        }
        return sum;
    }
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int amog=amogst(num);
        if (num==amog){
            System.out.println(" is amongstrong");
        }
        else {
            System.out.println(" not aromngstrong");
        }
    }
}
