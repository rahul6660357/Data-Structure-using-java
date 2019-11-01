public class DeleteNode{
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
        printTree(root);
        root = delete(root,5);
        printTree(root);
    }
    static Node delete(Node root,int data){
        if(root == null)
        return root;
        else if(data < root.data)
        {
            root.leftChild = delete(root.leftChild, data);
        }
        else if(data > root.data)
        {
            root.rightChild = delete(root.rightChild, data);
        }
        else
        {
            if(root.leftChild == null && root.rightChild == null)
            {
                return null;
            }
            else if(root.leftChild == null)
            {
                return root.rightChild;
            }
            else if(root.rightChild == null)
            {
                return root.leftChild;
            }
            else
            { //neither left child is null not right child is null
                Node temp = findMin(root.rightChild);
                root.data = temp.data;
                root.rightChild = delete(root.rightChild, temp.data);
            }
        }
        return root;
    }
    static Node findMin(Node root)
    {
        Node walk = root;
        while(walk.leftChild != null)
        {
            walk = walk.leftChild;
        }
        System.out.println(walk.data);
        return walk;
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
            System.out.print(root.data + " ");
            printTree(root.rightChild);
        }
    }
}