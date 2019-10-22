import java.util.Vector;

public class PrintAllPath{
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
        print(root);
    }

    static Vector<Node> v = new Vector<>(); 

    static void print(Node root){
        if(root == null)
        return ;
        v.add(root);
        print(root.leftChild);
        if(root.leftChild == null && root.rightChild == null)
        {
            for(int i=0;i<v.size();i++){
                System.out.print(v.get(i).data + " ");
            }
            System.out.println();
        }
        print(root.rightChild);
        v.remove(v.size()-1);
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