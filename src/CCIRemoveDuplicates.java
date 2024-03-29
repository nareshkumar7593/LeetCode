import java.util.HashMap;
import java.util.Map;

public class CCIRemoveDuplicates {

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

    CCIRemoveDuplicates ll = new CCIRemoveDuplicates();
    ll.head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    n6.next = n7;
    n7.next = n8;
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

    Map<Integer, Integer> rem = new HashMap<>();
    Node ptr2 = null;
    int count = 1;
    while(n1 != null){
      if(rem.containsKey(n1.data)){
        ptr2.next = n1.next;
      }

      else{
        rem.put(n1.data,count);
        ptr2 = n1;
      }

      n1 = n1.next;
    }

  }



}
