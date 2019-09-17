package LinkList;

import java.util.Scanner;

public class Middle_element_6 {
    Node head;
    class Node{
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    void additem(int d) {
        Node new_node = new Node(d);
        if (head == null) {
            head = new_node;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next=new_node;
        }
    }
    void printlist()
    {
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
    void findmiddle() {
        Node slow_ptr=head;
        Node fast_ptr=head;
        while (fast_ptr!=null&& fast_ptr.next!=null)
        {
            fast_ptr=fast_ptr.next.next;
            slow_ptr=slow_ptr.next;
        }
        System.out.println(slow_ptr.data);
    }

    public static void main(String Args[])
    {
        Middle_element_6 list= new Middle_element_6();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of nodes you want to enter");
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.additem(sc.nextInt());
        }
        list.printlist();
        list.findmiddle();
    }



}
