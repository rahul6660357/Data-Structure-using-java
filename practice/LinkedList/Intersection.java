/**
 * intersection point of two link list using stacks
 */
import java.util.*;
public class Intersection{
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Node m1 = new Node(9);
        Node m2 = new Node(8);
        Node m3 = new Node(7);
        m1.next = m2;
        m2.next = m3;
        m3.next = n3;

        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        Node walk = n1;
        while(walk != null)
        {
            s1.push(walk);
            walk = walk.next;
        }
        
        Node walk2 = m1;
        while(walk2 != null)
        {
            s2.push(walk2);
            walk2 = walk2.next;
        }

        Node temp = null;

        Node one = s1.pop();
        Node two = s2.pop();

        temp = one;

        while(true)
        {
            one = s1.pop();
            two = s2.pop();
            if(one != two)
            break;
            temp = one;
        }

        System.out.println(temp.data);
    }
}