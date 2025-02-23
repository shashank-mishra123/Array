package oops;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int number ;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit ");
        number=sc.nextInt();

        countdigit obj=new countdigit();
        System.out.println("1 enter for count digit");
        sumofdigit obj2=new sumofdigit();
        System.out.println("2 enter for reveres digit");
        System.out.println("3 enter for sum of digit");
        System.out.println("4 enter for maximum of digit");
        System.out.println("5 enter for minimum of digit");
        System.out.println("6 enter for stop");
        int x=sc.nextInt();
       switch (x)
       {
           case 1:
           {
             int c=  countdigit.count(number);
               System.out.println(c);
               break;
                 }
        case 2:
        {
           int e= sumofdigit.sum(number);
            System.out.println(e);
            break;
        }
           default:{
               System.out.println(" stop it");
               break;
           }
    }
    }
}
