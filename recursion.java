package oops;

import java.util.Arrays;

import static java.lang.System.out;

class recursion
 {
     static void printnumb(int n)
     {
         if(n<1) {
             return;
         }
         else {
           // System.out.println(n);
             printnumb(n - 1);
             System.out.println(n);
         }
     }
    public static void main(String[] args)
    {
             //f(f(x))=f(x^2)
        //print number 5to 1
        int n=5;
                printnumb(n);
    }
 }