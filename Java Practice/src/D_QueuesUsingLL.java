import java.util.*;
public class D_QueuesUsingLL {
    public static void main(String[] args) {
        Queue<String> q1=new LinkedList<>();
        q1.offer("Vedica");
        q1.offer("Sanvi");
        q1.offer("Yug");
        q1.offer("Divam");

        System.out.println(q1);

        q1.poll();
        q1.poll();

        System.out.println("After using poll() twice: " + q1);

        System.out.println(q1.peek()); //peek shows starting element at index 0.

//        note that we can also use add and remove however on being unsuccessful it will throw error, whereas
//        these methods return true or false on success or failure respectively.

    }
}
