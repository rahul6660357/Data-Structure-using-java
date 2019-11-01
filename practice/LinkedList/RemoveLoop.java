public class RemoveLoop{
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n4;
        removeLoop(n1);
        printList(n1);
        
    }

    static void removeLoop(Node root)
    {
        if(root == null)
        return ;
        Node fast = root.next.next;
        Node slow = root.next;
        try{
            fast = root.next.next;
            slow = root.next;
        }catch(NullPointerException e){
            return ;
        }
        while(fast != slow)
        {
            if(fast == null || fast.next == null)
            {
                System.out.println("There is no loop");
                return ;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        Node head = root;
        Node prev = null;

        while(true)
        {
            if(head == slow)
            break;
            head = head.next;
            prev = slow;
            slow = slow.next;
        }
        
        prev.next = null;
    }

    static void printList(Node root)
    {
        while(root != null)
        {
            System.out.println(root.data);
            root = root.next;
        }
    }
}