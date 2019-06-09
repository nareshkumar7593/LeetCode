public class LeetCode24SwapNodesInPairs {

  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }

  public static ListNode swapPairs(ListNode head) {
    ListNode firstPtr = head;
    ListNode secondPtr = head.next;
    ListNode secondCopy = secondPtr;
    ListNode output = secondCopy;
    while(firstPtr != null && firstPtr.next != null && secondPtr != null){
      firstPtr.next = secondPtr.next;
      secondPtr.next = firstPtr;
      if(firstPtr.next == null){
        output.next = secondPtr;
        break;
      }
      firstPtr = firstPtr.next;
      secondPtr = firstPtr.next;
    }

    return output;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(3);
    ListNode l4 = new ListNode(4);

    l1.next = l2;l2.next = l3; l3.next = l4;
    ListNode output = swapPairs(l1);

    while(output != null){
      System.out.println(output.val);
      output = output.next;
    }
  }
}