public class LinkedListInsert {

  Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

    public static void insertElement(Node p, int key){

    Node t = new Node(key);
    t.next = null;

    if(p==null){
      p = t;
      p.next = null;

    }    while( p.next != null && p.next.data < key){
      p= p.next;
    }
    t.next = p.next;
    p.next = t;
    }

    public static void main(String[] args) {
      LinkedListInsert ll = new LinkedListInsert();

      Node n1 = new Node(6);
      Node n2 = new Node(7);
      Node n3 = new Node(12);
      Node n4 = new Node(16);
      Node n5 = new Node(18);
      Node n6 = new Node(32);

      ll.head = n1;
      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      n4.next = n5;
      n5.next = n6;

      insertElement(n1, 39);

      Node test = n1;

      while(test!=null){
        System.out.println(test.data);
        test = test.next;
      }
  }
  }
