package BST;

public class Deletion_of_BST {
    Node root;
    class Node{
        Node left, right;
        int key;
        public Node(int key)
        {
            this.key=key;
            this.left=this.right=null;

        }
    }
    private void insert(int i) {
        root= InsertRec(root,i);
    }

    private Node InsertRec(Node root, int i) {
       Node new_node = new Node(i);
        if(root==null)
        {
            root=new_node;
        }
        if(i<root.key)
        {
            root.left=InsertRec(root.left,i);
        }
        else if(i>root.key){
            root.right= InsertRec(root.right,i);
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
        System.out.println(root.key);
        printRec(root.right);
    }
    }

    private void delete(int i) {
    root= deleterec(root,i);
    }

    private Node deleterec(Node root, int i) {
        if(root==null)
        {
            return root;
        }
       if(i<root.key){
           root.left= deleterec(root.left,i);
       }
       else if(i>root.key){
           root.right=deleterec(root.right,i);
       }
       else{
           if(root.left==null)
           {
               return root.right;
           }
           else if(root.right==null)
           {
               return root.left;
           }
           root.key=findmin(root.right);
           root.right= deleterec(root, root.key);
       }
      return root;
    }

    private int findmin(Node root) {
        int min=root.key;
        while(root.left!=null)
        {
            min=root.left.key;
            root=root.left;
        }
        return min;
    }

    public static void main(String args[])
    {
        Deletion_of_BST dd= new Deletion_of_BST();
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
        dd.delete(40);
        System.out.println("**************");
        dd.print();
    }



}
