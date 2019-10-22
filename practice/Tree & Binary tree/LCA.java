public class LCA{
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
        System.out.println(lowestCommonAncestor(root,10,1).data);
        
    }
    static Node lowestCommonAncestor(Node root,int one,int two)
    {
        if(root == null)
        return null;
        if(root.data == one || root.data == two)
        return root;
        Node lSide = lowestCommonAncestor(root.leftChild,one,two);
        Node rSide = lowestCommonAncestor(root.rightChild,one,two);
        if(lSide == null && rSide != null)
        {
            return rSide;
        }
        else if(lSide != null && rSide == null)
        {
            return lSide;
        }
        else if(lSide != null && rSide != null)
        {
            return root;
        }
        else
        {
            return null;
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