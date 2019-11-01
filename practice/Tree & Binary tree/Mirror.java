public class Mirror{
    public static void main(String[] args){
        int arr[] = {5,3,2,6,1,4,8,7};
        // int arr[] = {8,4,5,3};
        // int arr[] = {5,3,2,6,1,4,10,7,9,8};
        Node root = new Node(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<root.data) {
                attachInLeft(root,new Node(arr[i]));
            } else {
                attachInRight(root,new Node(arr[i]));
            }
        }

        mirror(root);
        printTree(root);
    }

    static void mirror(Node root){
        if(root == null)
        {
            return ;
        }
        Node temp = root.rightChild;
        root.rightChild = root.leftChild;
        root.leftChild = temp;
        mirror(root.leftChild);
        mirror(root.rightChild);
    }

    static void printTree(Node root){
        if(root == null)
        {
            return ;
        }else{
            printTree(root.leftChild);
            System.out.print(root.data + " ");
            printTree(root.rightChild);
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
}