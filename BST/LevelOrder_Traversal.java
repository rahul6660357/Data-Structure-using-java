package BST;

public class LevelOrder_Traversal {
    Node key;
    static class Node{
        Node left, right;
        int data;
        public  Node(int data)
        {
            this.data=data;
            this.left= this.right=null;
        }
    }

    private static Node constructor(int[] arr, int length) {
        if(length==0)
            return null;

        Node root =null;
            for(int i=0;i<length;i++)
            {
                root = LevelOrder(root,arr[i]);
            }
return root;
    }

    private static Node LevelOrder(Node root, int i) {
      Node new_Node= new Node(i);
        if(root==null){
root= new_Node;
        }
        if(i<root.data){
            root.left= LevelOrder(root.left, i);
        }
        else if(i>root.data)
        {
            root.right=LevelOrder(root.right,i);
        }
        return root;
    }

    private void print(Node root) {
        if(root!=null)
        {
            print(root.left);
            System.out.println(root.data);
            print(root.right);
        }
    }

    public static void main(String args[])
    {
        LevelOrder_Traversal ll= new LevelOrder_Traversal();
        int arr[]={7, 4, 12, 3, 6, 8, 1, 5, 10};
        Node root= constructor(arr, arr.length);
        System.out.println("Inorder Traversal");
        ll.print(root);
    }


}
