package BST;

import java.util.Scanner;

public class ReverseAlternateLevel {
    Node root;
    class Node{
        Node left, right;
        char data;
        public Node(char data)
        {
            this.data= data;
            this.left=this.right=null;
        }
    }
    public void insertNode(char data)
    {
        root =insertrec(root,data);
    }
    private Node insertrec(Node root, char i) {
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
    public void printNodes()
    {
        printRec(root);
    }
    private void printRec(Node root) {
        if(root!=null)
        {
            printRec(root.left);
            System.out.print(root.data+" ");
            printRec(root.right);
        }
     //   System.out.println();
    }
    public static void main(String Args[])
    {
        ReverseAlternateLevel list = new ReverseAlternateLevel();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the number of nodes you want to enter");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertNode(sc.next().charAt(0));
        }
        list.printNodes();

        list.reversealternatelevel(list.root);
        list.printNodes();

    }

    private void reversealternatelevel(Node root) {
        reverse(root.left,root.right,0);
    }

    private void reverse(Node root1,Node root2 ,int level) {
        if(root1==null || root2==null )
            return;
        if(level%2==0)
        {
            char temp= root1.data;
            root1.data=root2.data;
            root2.data=temp;
        }
        reverse(root1.left,root2.right, level+1);
        reverse(root1.right,root2.left, level+1);
    }
}
