import java.util.Stack;

public class PathWithSumK{
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

        printPath(root,12);
    }
    static  Stack<Node> st = new Stack<>();
    static int sum = 0;
    static void printPath(Node root ,int k){
        if(root == null)
        return ;
        sum = sum + root.data;
        st.push(root);
        if(sum == k)
        {
            printStack(st);
            return ;
        }

        printPath(root.leftChild, k);
        printPath(root.rightChild, k);

        Node poppedEle = st.pop();
        sum = sum - poppedEle.data;
    }

    static void printStack(Stack<Node> st){
        Stack<Node> st2 = new Stack<>();
        while(!st.isEmpty()){
            Node ele = st.pop();
            System.out.print(ele.data + " ");
            st2.push(ele);
        }
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
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