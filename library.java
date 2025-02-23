package oops;
import java.util.*;

class Books
{
    int serial_no;
    String book_name;
    int cost;
    public Books(int serial_no, String book_name, int cost) {
        this.serial_no = serial_no;
        this.book_name = book_name;
        this.cost = cost;
    }
}
public class library {
    public static void main(String[] args) {
        ArrayList<Books> book= new ArrayList<>();
        book.add(new Books(12,"shashank",3400));
        //  book.add(new Books(19,"gita",1500));
        System.out.println(book);


    }
}
