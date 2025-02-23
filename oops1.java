package oops;

 class A
{
   int a=21;
   int b=22;

}
/*class B extends A{
  static void a()
    {
        System.out.println("hiii"+a+b);
    }
}*/
public class oops1 {
   static void fun(int a)
    {
        System.out.println("a");
    }
   static void fun(int a,int b)
    {
        System.out.println("a,b");
    }
    public static void main(String[] args) {
       // A obj;
        int a;int b;
        a=0;
        b=9;
        fun(a);
        fun(a,b);
        fun(a);

    }
}
