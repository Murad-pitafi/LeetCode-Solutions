import java.util.Scanner;

class DLL {
    Node head;
    Node tail;
    Scanner sc = new Scanner(System.in);
    class Node {
        Node next;
        int val;
        Node prev;
    }
    public void insertBeginNode(int val)
    {
        Node firstNode = new Node();
        firstNode.val = val;
        firstNode.prev = null;
        firstNode.next = head;
        if (head != null)
            head.prev = firstNode;
        head = firstNode;
    }
    public void insertAtgivenPosition(){

    }
    public void insertEndNode(){

    }
    public void deleteAtEndNode(){

    }
    public void deleteAtStartNode(){

    }
    public void deleteAtgivenPosition(){

    }


    public void menu()
    {
        int opt = 0;
        do {
            System.out.println("Press 1 Insert a new node at the beginning of list.");
            System.out.println("press 2 for Insert a new node at the end of the list.");
            System.out.println("press 3 Insert a new node at given position by the user.");
            System.out.println("press 4 Delete a node at the end of the list.");
            System.out.println("press 5 Delete a node at the start of the list.");
            System.out.println("press 6 Delete a node at any point as given by the user.");
            System.out.println("press 7 Display List");
            System.out.println("press 0 for exit");
            opt = sc.nextInt();
            switch (opt) {
                case 1 -> insertBeginNode(4);
                case 2 -> insertEndNode();
                case 3 -> insertAtgivenPosition();
                case 4 -> deleteAtEndNode();
                case 5 -> deleteAtStartNode();
                case 6 -> deleteAtgivenPosition();
            }
        }while(opt != 0);
    }
}
public class task01 {
    public static void main(String[] args) {
        DLL d = new DLL();
        d.insertBeginNode(5);
        d.insertBeginNode(6);

    }
}
