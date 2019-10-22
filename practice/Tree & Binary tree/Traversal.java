public class Traversal{
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
        {
            return ;
        }
        inorder(root.leftChild);
        System.out.print(root.data + " ");
        inorder(root.rightChild);
    }

    static void preorder(Node root){
        if(root == null)
        {
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.leftChild);
        preorder(root.rightChild);
    }

    static void postorder(Node root){
        if(root == null)
        {
            return ;
        }
        postorder(root.leftChild);
        postorder(root.rightChild);
        System.out.print(root.data + " ");
    }
}


