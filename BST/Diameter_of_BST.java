package BST;

public class Diameter_of_BST {
Node root;
class Node{
    Node left, right;
    int data;
    public Node(int data)
    {
        this.data=data;
        this.left=this.right=null;
    }
}


    private void insert(int[] arr, int length) {
        for(int i=0;i<arr.length; i++)
        {
          root=  insertrec(arr[i],root);
        }
    }

    private Node insertrec(int i, Node root) {
   Node new_node = new Node(i);
    if(root==null){
        root=new_node;
    }
    if(i<root.data)
    {
        root.left= insertrec(i,root.left);
    }
    else if(i>root.data){
        root.right= insertrec(i, root.right);
    }
    return root;
    }
    private void print() {
        printrec(root);
    }

    private void printrec(Node root) {
        if(root==null){
            return;
        }
        System.out.println(root.data);
        printrec(root.left);
        printrec(root.right);
    }
    private int findDiameter() {
   int x= findDiameterrec(root);
   return x;
    }

    private int findDiameterrec(Node root) {
    if(root==null)
    {
        return 0;
    }
    int lheight= findheight(root.left);
    int rheight = findheight(root.right);
    int ld=findDiameterrec(root.left);
    int rd=findDiameterrec(root.right);

    int d= maxm((lheight+rheight+1),maxm(ld,rd));
    return d-1;
    }

    private int findheight(Node root) {
    if(root==null)
    {
        return 0;
    }
    int left= findheight(root.left);
    int right=findheight(root.right);
    int max= maxm(left,right);
    return max+1;
    }

    private int maxm(int left, int right) {
    if(left>right)
    {
        return left;
    }
    return right;
    }

    public static void main(String Args[]){
        Diameter_of_BST dd= new Diameter_of_BST();
        int arr[]= {1,5,7,10,19,16,25,11,18};
        dd.insert(arr, arr.length);

        dd.print();

       System.out.println( dd.findDiameter());
    }




}
