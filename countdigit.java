package oops;

public  class countdigit {
   public static int count(int number) {
       int d = 0;
       int count=0;
       while (number != 0) {
           d = number / 10;
           count++;
           number++;
       }
       return count;
   }

}
