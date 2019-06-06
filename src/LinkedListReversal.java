public class LinkedListReversal {

  static class Node{
    int data;
    Node next;
    Node(int d){
      data = d;
      next = null;
    }
  }

  public static void main(String[] args) {

    Node n1 = new Node(5);
    Node n2 = new Node(10);
    Node n3 = new Node(15);
    Node n4 = new Node(20);
    Node n5 = new Node(25);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    Node output = reversalList(n1);

    while(output!=null){
      System.out.println(output.data);
      output = output.next;
    }
  }

    public static Node reversalList(Node n1){
    Node prevPtr = null;
    Node nextPtr = null;
    Node current = n1;

    while(current != null){
      nextPtr = current.next;
      current.next = prevPtr;
      prevPtr = current;
      current = nextPtr;
    }

    return prevPtr;
    }
  }
