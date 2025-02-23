package oops;

public class recursiv_fibo {
    public static void fibo(int a,int b,int term){
        if (term==0){
            return;
        }
        int result=a+b;
        System.out.println(result);
        a=b;
        b=result;
        fibo(a,b,term-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int term=5;
        System.out.println(a+"\n"+b);
        fibo(a,b,term-2);

    }
}
