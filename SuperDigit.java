package oops;

import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        number= sc.nextInt();
        int d=0;
        int sum=0;
        for (int i=1;i<=number;i++)
        {
            d=number%10;
            number=number/10;
            sum=sum+d;
        }
        System.out.println(sum);
        int c=0;
        int sum2=0;
        for(int j=1;j<=sum;)
        {
            c=sum%10;
            sum=sum/10;
            sum2=sum2+c;
        }
        System.out.println(sum2);
    }
}
