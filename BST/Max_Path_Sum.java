package BST;

import java.util.Scanner;
class Rec{
    int val;
}
public class Max_Path_Sum {
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
    public void insertNode(int data)
    {
        root =insertrec(root,data);
    }
    private Node insertrec(Node root, int i) {
        Node new_node = new Node(i);
        if(root==null)
        {
            root=new_node;
        }
        if(i<root.key)
        {
            root.left=insertrec(root.left,i);
        }
        else if(i>root.key){
            root.right= insertrec(root.right,i);
        }
        return root;
    }
    public void printNodes()
    {
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
    public int findmaxsum()
    {
        Rec res = new Rec();
        res.val= Integer.MIN_VALUE;
       return findMax(root,res);
    }

    private int findMax(Node root, Rec res) {
        if(root==null)
        {
            return 0;
        }
        int l= findMax(root.left, res);
        int r= findMax(root.right, res);

        int max_single = Math.max(Math.max(l,r)+root.key, root.key);

        int max_val = Math.max(max_single, l+r+root.key);

        res.val= Math.max(max_val, res.val);
        return max_single;
    }

    public static void main(String Args[])
    {
        Max_Path_Sum list = new Max_Path_Sum();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the number of nodes you want to enter");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertNode(sc.nextInt());
        }
        list.printNodes();

       System.out.println( list.findmaxsum());
    }

}
