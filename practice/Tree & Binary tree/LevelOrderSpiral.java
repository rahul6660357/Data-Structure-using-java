import java.util.Stack;

public class LevelOrderSpiral{
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
        levelOrderTraversalSpiral(root);
    }

    static void levelOrderTraversalSpiral(Node root){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);

        while(true)
        {
            if(s1.isEmpty() && s2.isEmpty())
                break;
            while(!s1.isEmpty()){
                Node temp = s1.pop();
                System.out.print(temp.data + " ");
                if(temp.leftChild != null)
                s2.push(temp.leftChild);
                if(temp.rightChild != null)
                s2.push(temp.rightChild);
            }
            System.out.println();
            while(!s2.isEmpty()){
                Node temp = s2.pop();
                System.out.print(temp.data + " ");
                if(temp.rightChild != null)
                s1.push(temp.rightChild);
                if(temp.leftChild != null)
                s1.push(temp.leftChild);
            }
            System.out.println();
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