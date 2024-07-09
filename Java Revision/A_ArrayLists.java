import java.util.*;
public class A_ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Vedica");
        list1.add("Tanirika");
        list1.add("Sanvi");
        list1.add("Pari");
        list1.add("Krisha");

        System.out.println(list1.get(3));

        list1.remove(list1.indexOf("Sanvi"));
        System.out.println(list1.get(3));

        // adding list of elements together
        ArrayList<String> list2=new ArrayList<>();
        list2.addAll(Arrays.asList("Vedica", "Tanirika", "Sanvi", "Pari", "Krisha"));
        System.out.println(list2.contains("Vedica"));


        //  ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    
    }
}
