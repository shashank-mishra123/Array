package oops;
public class recursion_pattern {
     public  static void star(int i,int j)
    {
        if (i==0)
            return;
        else
        {
            star1(i,j);
            System.out.println();
            star(i-1,j);
        }
    }
    public static void star1(int i,int j)
    {
        if (j==0)
        return;
        else
        {
            System.out.print("*");
            star1(i,j-1);
        }
    }
    public static void main(String[] args) {
        int i=5;
        int j=5;
        star(i,j);
    }
}
