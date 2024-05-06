import java.util.*;

public class F_DeQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq= new ArrayDeque<>();

        dq.offer(1); //Appends at last
        dq.offerFirst(2); //obviously appends first
        dq.offerLast(3); //Same as .offer=> appends at last
        dq.offerLast(4);
        dq.offerFirst(5);
        dq.offerLast(6);
        dq.offerFirst(7);

        System.out.println(dq);

        System.out.println("Peek First: " + dq.peekFirst());
        System.out.println("Peek Last: " + dq.peekLast()); //can also use peek() to peek last

        dq.pollFirst();
        System.out.println("after poll first: " + dq);

        dq.pollLast();
        System.out.println("after poll last: " + dq);
    }
}
