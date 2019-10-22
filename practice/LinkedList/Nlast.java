public class Nlast{
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = null;
        // n2.next = n3;
        // n3.next = n4;
        // n4.next = n5;
        // n5.next = null;
        
        Node element = nLast(n1,2);
        if(element != null)
        System.out.println(element.data);
        else
        System.out.println("null");
    }
    static Node nLast(Node root,int n)
    {
        if(root == null || n == 0)
        return null;

        Node one = root;
        Node two = root;

        for(int i=0;i<n-1;i++)
        {
            if(two == null)
            return null;
            two = two.next;
        }

        if(two == null)
            return null;

        while(two.next != null)
        {
            two = two.next;
            one = one.next;
        }

        return one;
    }
}