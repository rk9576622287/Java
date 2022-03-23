import java.util.*;
public class linkedList1{
    public static void main (String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("111");
        name.add("222");
        name.add("333");
        name.add("444");
        name.addFirst("Ritesh");
        name.addLast("Vishal");
        System.out.println("Length of List is :"+name.size());
        System.out.println(name);
        name.set(0,"happy");
        System.out.println(name);
        System.out.println(name.getFirst());
        System.out.println(name.getLast());
        name.removeFirst();
        System.out.println(name);
    }
}