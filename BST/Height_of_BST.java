package BST;
public class Height_of_BST {
    Node root;
    class Node{
        Node left, right;
        int data;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }

    }
    private void insert(int i) {
root= insertrec(root,i);
    }

    private Node insertrec(Node root, int i) {
        Node new_node = new Node(i);
        if(root==null)
        {
            root=new_node;
        }
        if(i<root.data)
        {
            root.left=insertrec(root.left,i);
        }
        else if(i>root.data){
            root.right= insertrec(root.right,i);
        }
        return root;
    }
    private void print() {
        printRec(root);
    }

    private void printRec(Node root) {
        if(root!=null)
        {
            printRec(root.left);
            System.out.println(root.data);
            printRec(root.right);
        }
    }
    private int maxDepth() {
      int x= findmax(root);
        return x;
    }

    private int findmax(Node root) {
        if(root==null){
            return -1;
        }
        int ldepth= findmax(root.left);
        int rdepth= findmax(root.right);

        if(ldepth< rdepth)
        {
            return rdepth+1;
        }
        else {
            return ldepth+1;
        }
    }

    public static void main(String Args[])
    {
        Height_of_BST dd= new Height_of_BST();
        dd.insert(10);
        dd.insert(90);
        dd.insert(70);
        dd.insert(30);
        dd.insert(50);
        dd.insert(40);
        dd.insert(60);
        dd.insert(80);
        dd.insert(20);
        dd.print();
       int x= dd.maxDepth();
       System.out.println(x);
    }




}
