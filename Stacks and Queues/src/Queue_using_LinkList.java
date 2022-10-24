class NodeQueue {
    NodeQueue next;
    int data;
    NodeQueue(int d)
    {
        this.data = d;
        this.next = null;
    }
}
class Queue
{
    public NodeQueue head;
    public NodeQueue tail;
    public boolean isEmpty()
    {
        return head == null & tail == null;
    }
    public void add(int d)
    {
        NodeQueue newQueue = new NodeQueue(d);
        if (isEmpty())
        {
            head = tail = newQueue;
        }
        tail.next = newQueue;
        tail = newQueue;
    }
    public int remove()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
        }
        if (head == tail)
        {
            tail = null;
        }
        int front = head.data;
        head = head.next;
        return front;
    }
    public int peek()
    {
        return head.data;
    }
    public void printQueue()
    {
        while(!isEmpty()){
            System.out.println(head.data);
            remove();
        }
    }

}
public class Queue_using_LinkList {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(6);
        q.add(7);
        q.printQueue();
        //System.out.println(q.remove());
       // System.out.println(q.peek());
    }
}
