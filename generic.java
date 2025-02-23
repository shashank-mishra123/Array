package oops;

public class generic {
    public static void main(String[] args) {
        gen1 <Integer,String> gen=new gen1<>(343,"ram");
        gen.display();
    }
}
class gen1<T,S>{
    T rollNo;
    S name;

    public gen1(T rollNo, S name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void display()
    {
        System.out.println(rollNo+" "+name);
    }
}
