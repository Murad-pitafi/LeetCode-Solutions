class Stacks{
    private int top;
    private int []arr;
    private int capacity;
    Stacks(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == capacity -1;
    }
    public void push(int x)
    {
        if (isEmpty())
            System.out.println("stack empty");
        if(isFull())
            System.out.println("stack full");
        else
            arr[++top] = x;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            System.exit(1);
        }

            return arr[top--];
    }
    public void printStack()
    {
        for (int i = 0; i < capacity; i++)
        {
            System.out.print(arr[top--] + " ");
        }
    }
}
public class StackWithArrays {
    public static void main(String[] args) {
        Stacks st = new Stacks(4);
        st.push(6);
        st.push(3);
        st.push(8);
        st.push(3);
        //st.printStack();
        st.push(5);
    }
}
