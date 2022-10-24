class Node {
    Node next;
    int data;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Stack {
    public Node head;
    public boolean isEmpty()
    {
        return head == null;
    }
    public void push(int d)
    {
        Node newNode = new Node(d);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public int pop()
    {
        if (isEmpty())
        {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    public void clear()
    {
        head = null;
    }
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("stack is empty");
        }

        return head.data;


    }
    public void PushAtBottom(int data)
    {
        if (isEmpty())
        {
            push(data);
            return;
        }
        int top = pop();
        PushAtBottom(data);
        push(top);
    }
    public void reverse()
    {
        if (isEmpty())
        {
            return;
        }
        int top = pop();
        reverse();
        PushAtBottom(top);
    }
    public void printStack()
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
public class Stack_Using_LinkList {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.isEmpty());
        st.printStack();
        System.out.println("adding at bottom ");
        st.PushAtBottom(4);
        st.reverse();
        System.out.println("reversing ");
        st.printStack();
        System.out.println("peek" + st.peek());
        System.out.println("pop " +  st.pop());
        st.printStack();
        System.out.println("clearing");
        st.clear();
        System.out.println(st.isEmpty());
    }
}
