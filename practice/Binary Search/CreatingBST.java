public class CreatingBST{
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
        // Search s = new Search();
        // System.out.println(s.searchTheKey(root,7));
        int a[] = {1,2,3,4,5,6,7,8,9};
        // System.out.println(s.searchTheKey(a,10));
        Sumk s = new Sumk();
        System.out.println(s.findNumberOfPairs(a,10));
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