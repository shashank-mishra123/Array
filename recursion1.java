package oops;

//greatest comman division//
public class recursion1 {
    public static int divcomman(int num1,int num2,int n)
    {
        if (n==1)
            return -1;
        if (num1%n==0&&num2%n==0)
            return n;
        else return divcomman(num1, num2, n-1);

    }
    public static void main(String[] args) {
        int num1=15;
        int num2=25;
        int n=10;
        int r1=divcomman(num1,num2,n);
        System.out.println(r1);
        for (int i=2;i<10;i++)
        {
            if (num1%i==0&&num2%i==0)
                System.out.println(i);
        }

    }
}
