import java.util.ArrayDeque;

public class Vertical{
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
        verticalOrderTraversal(root);
        // printTree(root);
    }

    static void verticalOrderTraversal(Node root){
        ArrayDeque<Node> q = new ArrayDeque<>();
        root.dist = 0;
        q.add(root);


        Node neg[] = new Node[100];
        Node pos[] = new Node[100];
        pos[0] = root;
        while(!q.isEmpty()){
            Node temp = q.poll();

            if(temp.leftChild != null){
                int dist = temp.dist - 1;
                temp.leftChild.dist = dist;
                if(dist < 0){
                    neg[Math.abs(dist)] = temp.leftChild;
                }
                q.add(temp.leftChild);
            }

            if(temp.rightChild != null){
                int dist = temp.dist + 1;
                temp.rightChild.dist = dist;
                pos[dist] = temp.rightChild;
                q.add(temp.rightChild);
            }
        }

        for(int i=neg.length-1;i>=0;i--){
            if(neg[i]!=null)
            System.out.print(neg[i].data + " ");
        }

        for(int i=0;i<pos.length;i++){
            if(pos[i]!=null)
            System.out.print(pos[i].data + " ");
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

    static void printTree(Node root){
        if(root == null)
        {
            return ;
        }else{
            printTree(root.leftChild);
            System.out.println(root.data + "  " +root.dist);
            printTree(root.rightChild);
        }
    }
}