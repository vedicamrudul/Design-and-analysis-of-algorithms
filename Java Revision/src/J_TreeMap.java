import java.util.*;
public class J_TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> rollno= new TreeMap<>();
        rollno.put("Vedica", 182);
        rollno.put("Sanvi", 190);
        rollno.put("Sanvi duplicate", 190);

        System.out.println(rollno);

        rollno.put("Vedica", 100);
        // repeat value it gets overridden

        System.out.println(rollno);

        if(!rollno.containsKey("Vedica")){
            rollno.put("Vedica",102 );
            //to avoid overwriting
        }


//        how to iterate
        for(Map.Entry<String,Integer> e: rollno.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
