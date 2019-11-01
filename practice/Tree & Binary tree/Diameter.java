public class Diameter{
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

        // printTree(root);

        System.out.println(findDiameter(root));
    }
    static int findDiameter(Node root){
        if(root == null)
        return 0;
        int lheight = findHeight(root.leftChild);
        int rheight = findHeight(root.rightChild);
        int ldiameter = findDiameter(root.leftChild);
        int rdiameter = findDiameter(root.rightChild);

        int d = max(lheight+rheight+1,max(ldiameter,rdiameter));

        return d-1;
    }

    static int findHeight(Node root)
    {
        if(root == null)
        return 0;
        int lheight = findHeight(root.leftChild);
        int rheight = findHeight(root.rightChild);

        return max(lheight,rheight)+1;
    }

    static int max(int a,int b)
    {
        if(a>b)
        return a;
        return b;
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