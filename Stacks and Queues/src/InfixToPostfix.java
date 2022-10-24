import java.util.Stack;

class Infix_to_Postfix
{
    Stack<Character> st = new Stack<Character>();
    public int Prec(char c)
    {
        switch (c)
        {
            case '+':
                case '-':
                    return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;

        }
    }
    public String InfixToPostfix(String x)
    {

        String postfix = "";
        for (int i = 0; i < x.length(); i++)
        {
            char c = x.charAt(i);
            if(Character.isLetter(c))
            {
                postfix = postfix + c;
            } else if (c == '(') {
                st.push(c);
            } else if (c == '^') {
                st.push(c);
            }
            else if (c == ')')
            {
                while(!st.isEmpty() && st.peek() != ')')
                {
                    postfix = postfix + st.pop();
                }
                if(!st.isEmpty())
                    st.pop();
            }
            else{
                while(!st.isEmpty() && Prec(st.peek()) <= c)
                {
                    postfix = postfix + st.pop();
                }
                st.push(c);
            }

        }
        while(!st.isEmpty())
        {
            postfix = postfix + st.pop();
        }
        return postfix;
    }
}
public class InfixToPostfix {
    public static void main(String[] args) {
        Infix_to_Postfix abc = new Infix_to_Postfix();
        String infix = "m*n+(p-q)+r";
        System.out.println(abc.InfixToPostfix(infix));
    }

}
