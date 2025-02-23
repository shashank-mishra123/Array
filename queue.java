package oops;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        ArrayDeque<Integer> q1=new ArrayDeque<>();
        q1.add(45);
      //  System.out.println(q.poll());System.out.println(q.element());
      //  System.out.println(q.element());
        q1.add(32);
        q1.add(212);
       // System.out.println(q1);
        for (Integer e:q)
        {
         //   System.out.println(e);
        }
        Queue<Integer> q2=new ArrayDeque<>();
        q2.offer(34);
        q2.offer(546);
        q2.offer(47);
        q2.poll();
        q2.remove();
        System.out.println(q2);



    }
}
