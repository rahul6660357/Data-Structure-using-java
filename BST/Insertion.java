package BST;

public class Insertion {
    Node root;
    class Node {
        Node left, right;
        int data;
        public Node( int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }


    }
    private void insert(int i) {
        root=inorder(root,i);
    }

    public Node inorder(Node root, int i){
        Node new_node = new Node(i);
        if(root==null){

            root=new_node;
            return root;
        }
         if(i < root.data) {
     root.left=inorder(root.left,i);
        }
        else if(i> root.data){
            root.right=inorder(root.right, i);
        }
        return root;
    }

    private void print() {
         printorder(root);
    }

    private void printorder(Node root) {
        if(root!=null){
            printorder(root.left);
            System.out.println(root.data);
            printorder(root.right);
        }
    }

    private void search(int i) {
         root= Search(root,i);
         if(root!=null)
         {
             System.out.println("value is present" +root);
         }
         else{
             System.out.println(root);
         }
    }

    private Node Search(Node root, int i) {
        if(root==null || root.data==i){
            return root;
        }
        if(root.data>i){
            return Search(root.left,i);
        }
        else{
            return Search(root.right,i);
        }
    }

    public static void main(String Args[])
    {
        Insertion ii= new Insertion();

        ii.insert(50);
        ii.insert(30);
        ii.insert(20);
        ii.insert(40);
        ii.insert(70);
        ii.insert(60);
        ii.insert(80);

        ii.print();
        ii.search(60);
    }



}
