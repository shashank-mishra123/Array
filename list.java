package oops;

import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer>list1 =new ArrayList<>();
        list1.add(45);
        list1.add(56);
        list1.add(67);
        list1.add(36);
        list1.add(36);
        System.out.println(list1.contains(45));
       // list1.remove(Integer .valueOf(45));
        System.out.println(list1);
        for (Integer e:list1)
        {
            if (e==45)
            {
                System.out.println("yes");
            }
            else {
                System.out.println(e);
            }
        }

    }
}
class Library
{
    String BNmame;
    int num;

    public Library(String BNmame) {
        this.BNmame = BNmame;
    }

    public Library(int num) {
        this.num = num;
    }
}
class LL
{
    List<Library> l1 ;

    public LL(List<Library> l1) {
        this.l1 = l1;
    }
    public void add(Library l1)
    {
    }
}
