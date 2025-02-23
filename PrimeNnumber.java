package oops;

import java.util.Scanner;

public class PrimeNnumber {
    public static void main(String[] args) {
        int number;
        System.out.println(" enter a N number");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        int prime=0;
        int count;
        int c=0;
        for (int i=1;i<=number;i++) {
            prime=i;
            count=0;
            for (int j = 1; j <= prime; j++) {
                if (prime % j == 0)
                    count++;
            }
            if (count==2){
                System.out.println(prime +"");
            }
        }
    }
}
