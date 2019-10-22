public class ReverseItr{
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;n2.next = n3;n3.next = n4;n4.next = null;
        Node walk = n1;
        
        Node prev=null,nextNode=null;
        while(walk != null)
        {
            nextNode = walk.next;
            walk.next = prev;
            prev = walk;
            walk = nextNode;
        }
        walk = prev;
        while(walk != null)
        {
            System.out.println(walk.data);
            walk = walk.next;
        }
        /**Iterative method for reversing a linked list */
    }
}