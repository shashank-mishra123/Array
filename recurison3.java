package oops;

public class recurison3 {
    public static void skip(String s,char a,int i)
    {
        if (i==s.length()-1)
            return;
        else{
            if (a==i)
            {
                return;
            }
            else {
                skip(s,a,i+1);
            }
        }
    }
    public static void main(String[] args) {
        String s="shashank";
        char a='a';
        int i=0;
        skip(s,a,i);
    }
}
