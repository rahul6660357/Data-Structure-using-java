public class Reverse{
    static Node Head;
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;n2.next = n3;n3.next = n4;n4.next = null;
        Node walk = n1;
        
        Node last = reverse(walk);
        last.next = null;
        // System.out.println(Head);
        while(Head != null)
        {
            System.out.println(Head.data);
            Head = Head.next;
        }
    }
    static Node reverse(Node root)
    {
        if(root == null)
        return null;
        Node prev = reverse(root.next);
        if(prev == null)
        {
            Head = root;
            return root ;
        } else{
            prev.next = root;
        }
        return root;
    }
}