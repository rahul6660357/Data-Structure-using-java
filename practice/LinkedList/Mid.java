public class Mid{
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;n2.next = n3;n3.next = n4;n4.next = n5;n5.next = null;
        
        Node mid = findMid(n1);
        if(mid != null)
        System.out.println(mid.data);
        else
        System.out.println("null");
    }
    static Node findMid(Node root)
    {
        if(root == null)
        return null;

        Node fast = root;
        Node slow = root;

        Node mid = null;

        while(true)
        {
            if(fast == null || fast.next == null)
            {
                mid = slow;
                break;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        return mid;
    }
}