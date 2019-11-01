public class ValidBst{
    public static void main(String[] args){
        // int arr[] = {5,3,2,6,1,4,8,7};
        // int arr[] = {8,4,5,3};
        // int arr[] = {5,3,2,6,1,4,10,7,9,8};
        // Node root = new Node(arr[0]);
        // for(int i=1;i<arr.length;i++)
        // {
        //     if(arr[i]<root.data) {
        //         attachInLeft(root,new Node(arr[i]));
        //     } else {
        //         attachInRight(root,new Node(arr[i]));
        //     }
        // }

        Node root = new Node(2);
        Node root2 = new Node(1);
        Node root3 = new Node(3);
        root.leftChild = root2;
        root.rightChild = root3;
        root2.leftChild = null;
        root2.rightChild = null;
        root3.rightChild = null;
        root3.leftChild = null;
        // printTree(root);
        System.out.println(check(root,-9999,9999));
    }
    static boolean check(Node root,int min,int max){
        if(root == null)
        {
            return true;
        }
        if(root.data >= min && root.data<=max)
        {
            boolean leftCheck = check(root.leftChild, min, root.data);
            boolean rightCheck = check(root.rightChild, root.data, max);
            if(rightCheck && leftCheck && true)
            return true;
        }

        return false;
        
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