public class CCIKthtoEnd {

  Node head;

  static class Node{
    int data;
    Node next;

    Node(int d){data = d; next = null;}
  }

  public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(10);
    Node n4 = new Node(15);
    Node n5 = new Node(20);
    Node n6 = new Node(7);
    Node n7 = new Node(15);
    Node n8 = new Node(2);

    CCIKthtoEnd ll = new CCIKthtoEnd();
    ll.head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    n6.next = n7;
    n7.next = n8;

    kthToEnd(ll.head, 3);
    //printElements(ll.head);

  }

  private static void kthToEnd(Node head, int n) {
    while(n>0){
      head = head.next;
      n--;
    }
    printElements(head);
  }

  private static void printElements(Node n1) {

    while(n1!= null){
      System.out.println(n1.data);
      n1 = n1.next;

    }
  }
}
