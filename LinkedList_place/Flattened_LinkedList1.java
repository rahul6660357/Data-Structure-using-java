package LinkedList_place;

public class Flattened_LinkedList1 {
    Node head;
    class Node{
        Node down;
        Node right;
        int data;
        public Node(int data)
        {
            this.data= data;
            this.down= null;
            this.right= null;
        }
    }

    public Node push(Node ref_head, int data)
    {
        Node new_node = new Node(data);

        new_node.down= ref_head;
        ref_head= new_node;

        return ref_head;

    }
    public Node flattens(Node root)
    {
        if(root == null || root.right== null)
        {
            return  root;
        }
        root.right= flattens(root.right);

        root= merge(root, root.right);

        return root;
    }

    private Node merge(Node a, Node b) {
        if(a== null)
        {
            return b;
        }
        if(b== null)
        {
            return a;
        }
        Node result = null;
        if(a.data< b.data)
        {
            result= a;
            result.down = merge(a.down, b);
        }
        else{
            result= b;
            result.down= merge(b.down, a);
        }
        return result;
    }

    public static void main(String Args[]) {

Flattened_LinkedList1 ff= new Flattened_LinkedList1();
    ff.head = ff.push(ff.head, 30);
    ff.head = ff.push(ff.head, 8);
    ff.head = ff.push(ff.head, 7);
    ff.head = ff.push(ff.head, 5);

    ff.head.right = ff.push(ff.head.right, 20);
    ff.head.right = ff.push(ff.head.right, 10);

    ff.head.right.right = ff.push(ff.head.right.right, 50);
    ff.head.right.right = ff.push(ff.head.right.right, 22);
    ff.head.right.right = ff.push(ff.head.right.right, 19);

    ff.head.right.right.right = ff.push(ff.head.right.right.right, 45);
    ff.head.right.right.right = ff.push(ff.head.right.right.right, 40);
    ff.head.right.right.right = ff.push(ff.head.right.right.right, 28);

    ff.head = ff.flattens(ff.head);
    ff.printlist(ff.head);
}

    private void printlist(Node head) {
    Node ptr= head;
    while(ptr!=null)
    {
        System.out.print(ptr.data+ " ");
        ptr= ptr.down;
    }
    }
}
