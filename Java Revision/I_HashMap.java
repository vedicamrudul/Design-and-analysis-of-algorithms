import java.util.*;

public class I_HashMap {
    public static void main(String[] args) {
        Map<String, Number> rollno= new HashMap<>();

        rollno.put("Vedica", 182);
        rollno.put("Yug", 190);
        rollno.put("Yug duplicate", 190);

        System.out.println(rollno);

        rollno.put("Vedica", 100);
        // repeat value it gets overridden

        System.out.println(rollno);

        if(!rollno.containsKey("Vedica")){
            rollno.put("Vedica",102 );
            //to avoid overwriting
        }


//        how to iterate
        for(Map.Entry<String,Number> e: rollno.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
