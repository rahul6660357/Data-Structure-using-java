import java.util.*;

public class ReverseStack{
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;n2.next = n3;n3.next = n4;n4.next = null;
        Node walk = n1;
        
        Stack<Node> s = new Stack<>();
        while(walk != null)
        {
            s.push(walk);
            walk = walk.next;
        }

        Node prev = s.pop();
        Node head = prev;
        while(!s.isEmpty()){
            Node currNode = s.pop();
            // System.out.println(currNode.data + " is popped out");
            prev.next = currNode;
            prev = currNode;
        }
        prev.next = null;
        while(head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
}