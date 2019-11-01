public class MaxCost{
    public static void main(String[] args){
        // int arr[] = {5,3,2,6,1,4,8,7};
        // int arr[] = {8,4,5,3};
        // int arr[] = {5,3,2,6,1,4,10,7,9,8};
        int arr[] = {20,2,1,10,10,-25,3,4};
        Node root = new Node(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<root.data) {
                attachInLeft(root,new Node(arr[i]));
            } else {
                attachInRight(root,new Node(arr[i]));
            }
        }
        System.out.println(findMaxCost(root));
    }

    static int findMaxCost(Node root){
        if(root == null){
            return 0;
        }
        int leftCost = root.data + findMaxCost(root.leftChild);
        int rightCost = root.data + findMaxCost(root.rightChild);
        if(leftCost > rightCost)
            return leftCost;
        return rightCost;
    }

    static void attachInLeft(Node root,Node new_node){
        if(root.leftChild == null && root.data >= new_node.data){
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
        if(root.rightChild == null && root.data <= new_node.data){
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