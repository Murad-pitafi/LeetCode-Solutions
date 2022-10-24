import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(53);
        st.push(89);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());

    }
}
