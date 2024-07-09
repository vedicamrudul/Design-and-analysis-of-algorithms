import java.util.*;

public class B_Stack {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);

        System.out.println(s1);
        System.out.println("let us peek now shall we? : " + s1.peek() );

        s1.pop();
        s1.pop();
        System.out.println("Stack after popping two times: " + s1);
    }
}
