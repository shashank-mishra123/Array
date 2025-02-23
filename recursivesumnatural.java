package oops;

public class recursivesumnatural {
    public static int  sum_natural(int n,int sum)
    {
        if (n==6){
            return 0;
        }
        return  n+sum_natural(n+1,sum);
    }
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        int re=0;
        int s=sum_natural(n,sum);
        System.out.println(s);
    }
}
