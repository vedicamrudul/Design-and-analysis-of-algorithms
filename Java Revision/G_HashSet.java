import java.util.*;
public class G_HashSet {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();

        s1.add(55);
        s1.add(44);
        s1.add(23);
        s1.add(64);
        // s1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

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
