import java.util.*;

public class C_Stack_ReverseString {
    public static void main(String[] args) {
        Stack<Character> s1= new Stack<>();
        String word=new String();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word: ");
        word=sc.next();

        word.trim();

        for(int i=0; i<word.length(); i++){
            s1.push(word.charAt(i));
        }

        System.out.println(s1.size());
        System.out.println("The reversed string is: ");
        int size= s1.size();
        for(int i=0; i<size; i++){
            System.out.print(s1.peek());
           s1.pop();

        }
    }
}
