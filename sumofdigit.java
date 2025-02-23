package oops;

public class sumofdigit {
     static int sum(int number)
    {
        int d=0;
        int sum=0;
        while(number!=0){
            d=number%10;
           sum=sum+d;
           number=number/10;
           number++;
        }
        return sum;
    }
}
