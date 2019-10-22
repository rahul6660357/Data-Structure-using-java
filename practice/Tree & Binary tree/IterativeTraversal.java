import java.util.*;
public class IterativeTraversal{
    public static void main(String[] args){
        int arr[] = {5,3,2,6,1,4,8,7};
        // int arr[] = {8,4,5,3};
        Node root = new Node(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<root.data) {
                attachInLeft(root,new Node(arr[i]));
            } else {
                attachInRight(root,new Node(arr[i]));
            }
        }

        /** on doing inorder traversal of a BST it gives a sorted order of numbers */
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        preorder(root);
    }

    static void attachInLeft(Node root,Node new_node){
        if(root.leftChild == null){
            root.leftChild = new_node;
            return ;
        }
        if(new_node.data < root.data) {
            attachInLeft(root.leftChild,new_node);
        } else {
            attachInRight(root,new_node);
        }
    }

    static void attachInRight(Node root,Node new_node){
        if(root.rightChild == null){
            root.rightChild = new_node;
            return ;
        }
        if(new_node.data < root.data) {
            attachInLeft(root,new_node);
        } else {
            attachInRight(root.rightChild,new_node);
        }
    }

    static void inorder(Node root){
        if(root == null)
        return ;
        Stack<Node> s = new Stack<>();
        while(true)
        {
            while(root!=null)
            {
                s.push(root);
                root = root.leftChild;
            }

            if(s.isEmpty())
            break;

            root = s.pop();
            System.out.print(root.data + " ");
            root = root.rightChild;
        }
    }

    static void postorder(Node root)
    {
        if(root == null)
        return ;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty())
        {
            Node temp = s1.pop();
            s2.push(temp);

            if(temp.leftChild != null)
                s1.push(temp.leftChild);
            if(temp.rightChild != null)
                s1.push(temp.rightChild);
        }
        while(!s2.isEmpty()){
            Node temp = s2.pop();
            System.out.print(temp.data + " ");
        }
    }

    static void preorder(Node root)
    {
        if(root == null)
        return ;
        Stack<Node> s = new Stack<>();
        while(true)
        {
            while(root != null)
            {
                System.out.print(root.data + " ");
                s.push(root);
                root = root.leftChild;
            }
            if(s.isEmpty())
            break;

            root = s.pop();
            root = root.rightChild;
        }
    }
}