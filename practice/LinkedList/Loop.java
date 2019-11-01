class Result {
    static int loopInList(Node head) {
      if(head == null)
        return 0;
      Node slow = head;
      Node fast = head;
      Node meet = null;
      int flg = 0;
      slow = slow.next;
      fast = fast.next.next;
      while(true)
      {
        if(fast == null || slow == null)
          return 0;
        if(fast == slow )
          {
              meet = slow;
              flg++;
              break;
          }
        slow = slow.next;
        fast = fast.next.next;
      }
      int count = 0;
         Node temp = head;
      while(temp!=meet)
      {
        temp = temp.next;
        meet = meet.next;
      }
      Node chead = temp;
      temp = temp.next;
      count++;
      while(temp!=chead)
      {
        temp = temp.next;
        count++;
      }
      
      return count;
    }
  }

  public class Loop{
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
        n5.next = n1;

        int count = Result.loopInList(n1);

        System.out.println(count);
    }
  }