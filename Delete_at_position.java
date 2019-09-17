import java.util.Scanner;

public class Delete_at_position {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    void insertvalue(int d) {
    Node new_node= new Node(d);
    if(head==null)
    {
        head=new_node;
    }
    else {
        Node ptr= head;
        while (ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=new_node;
    }
    }
    void display()
    {
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
    void deleteatpos(int i) {
        int count=0;
        Node ptr=head;
        if(i==1)
        {
            head=head.next;
        }
        else {
            while (ptr != null) {
                if (count + 2 == i) {
                    break;
                }
                count++;
                ptr = ptr.next;
            }
            ptr.next = ptr.next.next;
        }
    }
    void deleteitem(int i) {
        Node ptr=head;
        if(head.data==i)
        {
            head=ptr.next;
        }
        else {
            while (ptr != null) {
                if (ptr.next.data == i) {
                    break;
                }
                ptr = ptr.next;

            }
            ptr.next = ptr.next.next;
        }
    }

    public static void main(String Args[])
    {
        System.out.println("enter the number of nodes you want to enter");
        int n;

        Delete_at_position list= new Delete_at_position();
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertvalue(sc.nextInt());
        }
        list.display();
//        list.deleteatpos(1);
//        list.display();
        list.deleteitem(2);
        list.display();
    }



}
