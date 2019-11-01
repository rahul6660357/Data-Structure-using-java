package BST;

import java.util.ArrayDeque;

public class LevelOrder {
    Node root;
    class Node{
        Node left, right;
        int data;
        public Node(int data){
            this.data=data;
        this.left=this.right=null;
        }
    }
    private void insert(int[] arr, int length) {
        for(int i=0;i<arr.length; i++)
        {
            root=  insertrec(arr[i],root);
        }
    }

    private Node insertrec(int i, Node root) {
        Node new_node = new Node(i);
        if(root==null){
            root=new_node;
        }
        if(i<root.data)
        {
            root.left= insertrec(i,root.left);
        }
        else if(i>root.data){
            root.right= insertrec(i, root.right);
        }
        return root;
    }
    private void print() {
        printrec(root);
    }

    private void printrec(Node root) {
        if(root==null){
            return;
        }
        printrec(root.left);
        System.out.print(root.data+" ");
        printrec(root.right);
    }


    private void level(Node root) {
        ArrayDeque<Node> q= new ArrayDeque<>();
        q.add(root);
        int size=1;
        int count=0;
        while(!q.isEmpty())
        {
            while(size!=0)
            {
                Node temp= q.poll();
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                {
                    q.add(temp.left);
                    count++;
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                    count++;
                }
                size--;
            }
            if(size==0)
            {
                System.out.println();
                int t=count;
                count=0;
                size=t;
            }
        }
    }
    public static void main(String Args[])
    {
        LevelOrder dd= new LevelOrder();
        int arr[]= {1,5,7,10,19,16,25,11,18};
        dd.insert(arr, arr.length);

        dd.print();
        dd.Levelorder();
        dd.isBst();
    }

    private void isBst() {
         if(checkBST(root))
        {
            System.out.println("tree is BST");
        }
            else
            System.out.println("tree is not BST");
    }

    private boolean checkBST(Node root) {
        if(root==null)
        {
            return true;
        }
        if(root.left!=null && root.left.data< root.data)
        {
            return true;
        }
        if(root.right!=null && root.right.data>root.data)
        {
            return true;
        }
if((!checkBST(root.left) || !checkBST(root.right))) {
    return false;
        }
        return false;
    }

    private void Levelorder() {
        level(root);
    }

}
