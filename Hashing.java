import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();
        
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //search - contains
        if(set.contains(1))  {
            System.out.println("Set contains 1");;
        }
        if(!set.contains(6)) {
            System.out.println("Does not contain");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("Removed 1");
        }

        //Size
        System.out.println("Size of set is " +set.size());

        //Print all elements
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        System.out.println(it);
        //HasNext = > agar hai to true otherwise false
        //Next next element
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
