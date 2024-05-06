import java.util.*;
// it works like a sorted set. No dupicates but sorted. I think it is a binary search tree or something.
public class H_TreeSet {
    public static void main(String[] args) {
        Set<Integer> s1 = new TreeSet<>();

        s1.add(55);
        s1.add(44);
        s1.add(23);
        s1.add(64);

        System.out.println(s1);

        s1.add(44);
        s1.add(44);
        s1.add(44);
        s1.add(44);
        // will ignore cuz 44 is already present. Sets do not allow duplicates.

        System.out.println("After trying to add 44 many times: " + s1);

        s1.remove(44);

        System.out.println("After removing 44: " + s1);

        System.out.println("size: " + s1.size());
        System.out.println( "does s1 contain 55? : " + s1.contains(55) );


    }
}
