class Node {
    int data;
    Node left;
    Node right;
    Node(int d)
    {
        this.data = d;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree{
    static int idx = -1;
    public Node buildtree(int [] node)
    {
        idx++;
        if (node[idx] == -1)
        {
            return null;
        }
        Node newNode = new Node(node[idx]);
        newNode.left = buildtree(node);
        newNode.right = buildtree(node);
        return newNode;
    }
}
public class BuildingTree {
    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1, -1, 5, -1, 3, -1, 6, -1, -1};
        BinaryTree obj = new BinaryTree();
        Node root = obj.buildtree(nodes);
        System.out.println(root.data);
    }

}
