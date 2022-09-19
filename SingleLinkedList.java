class LL {
    Node head;
    private int size;
    LL(){
        size++;
    }
    class Node {
        Node next; int data;
    }
    public void addFirst(int d)
    {
        Node firstNode = new Node();
        firstNode.data = d;
        firstNode.next = null;
        if (head == null)
        {
            head = firstNode;
        }
        else {
            firstNode.next = head;
            head = firstNode;
        }
    }
    public void addLast(int d) {
        Node lastNode = new Node();
        Node currentNode = head;
        lastNode.data = d;
        lastNode.next = null;
        if (head == null) {
            head = lastNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = lastNode;
        }
    }
        public void print()
        {
            Node iterate = head;
            while(iterate.next != null)
            {
                System.out.print(iterate.data + " ");
                iterate = iterate.next;
            }
            System.out.println();
        }
    }
public class SingleLinkedList {
    public static void main(String[] args) {
        LL obj = new LL();
        obj.addFirst(5);
        obj.addFirst(1);
        obj.print();
        obj.addLast(6);
        obj.addLast(7);
        obj.print();
    }

}
