import java.util.*;
public class TopView{
    public static void main(String[] args){
        // int arr[] = {5,3,2,6,1,4,8,7};
        // int arr[] = {8,4,5,3};
        int arr[] = {5,3,2,6,1,4,10,7,9,8};
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
        // printTree(root);
        topView(root);
    }

    static void topView(Node root){
        Stack<Node> s = new Stack<>();
        Node walk = root.leftChild;
        while(walk!=null)
        {
            s.push(walk);
            walk = walk.leftChild;
        }
        while(!s.isEmpty()){
            System.out.print(s.pop().data + " ");
        }
        System.out.println(root.data);
        walk = root.rightChild;
        while(walk!=null)
        {
            System.out.print(walk.data + " ");
            walk = walk.rightChild;
        }
    }

    static void attachInLeft(Node root,Node new_node){
        if(root.leftChild == null && root.data > new_node.data){
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
        if(root.rightChild == null && root.data < new_node.data){
            root.rightChild = new_node;
            return ;
        }
        if(new_node.data < root.data) {
            attachInLeft(root,new_node);
        } else {
            attachInRight(root.rightChild,new_node);
        }
    }

    static void printTree(Node root){
        if(root == null)
        {
            return ;
        }else{
            printTree(root.leftChild);
            System.out.println(root.data);
            printTree(root.rightChild);
        }
    }
}