package oops;

class ths{
int a;
String b;
    ths(int a, String b)
    {
        this .a=a;
        this .b=b;
    }
    void diplay(){
        System.out.println(a+""+b);
    }
}
public class thiskey {
    public static void main(String[] args) {
         ths obj=new ths(23,"shashank");
         obj.diplay();
    }
}
