class double_node{
    Node head;
    Node tail;
    class Node {
        Node next;
        Node prev;
        int date;
    }
    public void addFront(int d)
    {
        Node node = new Node();
        node.date = d;
        node.next = null;
        node.prev = null;
        if (head == null)
            head = node;

        else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
}
public class double_linkedList {
}
