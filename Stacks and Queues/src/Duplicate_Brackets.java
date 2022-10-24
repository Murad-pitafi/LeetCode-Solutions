import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String[] args) {
        String str = "(a+b) + ((c+d))";
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i <str.length(); i++) {
             char c = str.charAt(i);
             if (c == ')')
             {
                 if (st.peek() == '(')
                 {
                     System.out.println("true");
                     return;
                 }
                 else {
                     while(st.peek() != '(')
                     {
                         st.pop();
                     }
                     st.pop();
                 }
             }
             else {
                 st.push(c);
             }

        }
        System.out.println(false);
    }


}
