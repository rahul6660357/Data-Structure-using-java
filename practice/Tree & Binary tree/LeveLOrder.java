import java.util.*;
public class LeveLOrder{
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
        levelOrderTraversal(root);
    }

    static void levelOrderTraversal(Node root){
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(root);
        int size = 1;
        int count = 0;
        while(!q.isEmpty()){
            while(size != 0)
            {
                Node temp = q.poll();
                System.out.print(temp.data + " ");
                if(temp.leftChild != null)
                {q.add(temp.leftChild);count++;}
                if(temp.rightChild != null)
                {q.add(temp.rightChild);count++;}

                size--;
            }
            if(size == 0)
            {
                System.out.println();
                size = count;
                count = 0;
            }
        }
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
}