public class InorderPredecessor{
    static void inorderPredecessor(Node n,Node root){
        if(n.leftChild != null)
        {
            Node temp = n.leftChild;
            while(temp.rightChild != null)
            {
                temp = temp.rightChild;
            }
            System.out.println(temp.data);
        } else{
            try{
                Node result = null;
                while(root != n)
                {
                    if(n.data > root.data)
                    {
                        result = root;
                        root = root.rightChild;
                    }
                    else
                    root = root.leftChild;
                }
                
                System.out.println(result.data);
            }catch(NullPointerException e){
                System.out.println("There is no pre for this element");
            }
        }
    }
    public static void main(String args[]){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        one.leftChild = two;
        one.rightChild = three;

        two.leftChild = four;
        two.rightChild = five;

        three.leftChild = six;

        inorderPredecessor(six, one);
    }
}