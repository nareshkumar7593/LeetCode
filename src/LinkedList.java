public class LinkedList {

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

    LinkedList ll = new LinkedList();
    ll.head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    removeDuplicate(ll.head);
    printElements(ll.head);

  }

  private static void printElements(Node n1) {

    while(n1!= null){
      System.out.println(n1.data);
      n1 = n1.next;

    }
  }

  private static void removeDuplicate(Node n1) {
    Node ptr2;

    while(n1.next != null){
      ptr2 = n1;

      while(ptr2.next != null){
        if(n1.data == ptr2.next.data)
          ptr2.next = ptr2.next.next;
        else
          ptr2 = ptr2.next;
      }

      n1 = n1.next;

    }
  }





//  void remove_duplicates() {
//    Node ptr1 = null, ptr2 = null, dup = null;
//    ptr1 = head;
//
//    /* Pick elements one by one */
//    while (ptr1 != null && ptr1.next != null) {
//      ptr2 = ptr1;
//
//            /* Compare the picked element with rest
//                of the elements */
//      while (ptr2.next != null) {
//
//        /* If duplicate then delete it */
//        if (ptr1.data == ptr2.next.data) {
//
//          /* sequence of steps is important here */
//          dup = ptr2.next;
//          ptr2.next = ptr2.next.next;
//          System.gc();
//        } else /* This is tricky */ {
//          ptr2 = ptr2.next;
//        }
//      }
//      ptr1 = ptr1.next;
//    }
//  }
}
