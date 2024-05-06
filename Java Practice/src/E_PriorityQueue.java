import java.util.*;
public class E_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> p1= new PriorityQueue<>();
//      Queue<Integer> p1= new PriorityQueue<>(Comparator.reverseOrder()); to implement max heap.

        p1.offer(55);
        p1.offer(456);
        p1.offer(45);
        p1.offer(98);
        p1.offer(23);
        p1.offer(78);
        //under the hood min heap is being implemented.

        System.out.println(p1);

        System.out.println("\n\nnow min element was: " + p1.peek());
        p1.poll();
        System.out.println(p1);

        System.out.println("\n\nnow min element was: " + p1.peek());
        p1.poll();
        System.out.println(p1);

        System.out.println("\n\nnow min element was: " + p1.peek());
        p1.poll();
        System.out.println(p1);

        System.out.println("\n\nnow min element was: " + p1.peek());
        p1.poll();
        System.out.println(p1);
    }

}
