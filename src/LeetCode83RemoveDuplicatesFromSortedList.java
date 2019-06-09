//import java.util.HashSet;
//import java.util.Set;
//
//public class LeetCode83RemoveDuplicatesFromSortedList {
//
//  public static class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//      val = x;
//    }
//  }
//
//  public static ListNode deleteDuplicates(ListNode head) {
//    ListNode firstPtr = head;
//    ListNode secondPtr = head;
//    ListNode secondPtrCopy = secondPtr;
//    ListNode firstPtrCopy = firstPtr;
//
//    Set<Integer> s = new HashSet<>();
//
//
//    while (firstPtr != null) {
//      s.add(firstPtr.val);
//      while (secondPtr.next != null) {
//        if (s.contains(secondPtr.next.val))
//          secondPtr.next = secondPtr.next.next;
//
//        secondPtr = secondPtr.next;
//      }
//      firstPtr = secondPtrCopy;
//      secondPtr = firstPtr;
//      firstPtr = firstPtr.next;
//      secondPtr = secondPtr.next;
//    }
//    return firstPtrCopy;
//
//  }
//
//  public static void main(String[] args) {
//
//    ListNode l1 = new ListNode(1);
//    ListNode l2 = new ListNode(1);
//    ListNode l3 = new ListNode(2);
//    ListNode l4 = new ListNode(3);
//    ListNode l5 = new ListNode(3);
//    l1.next = l2;l2.next = l3;
//    l3.next = l4;l4.next = l5;
//
//    ListNode output = deleteDuplicates(l1);
//
//    System.out.println(output.val);
//  }
//}
//

// ******************************************************************************

//Actual code
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//class LeetCode83RemoveDuplicatesFromSortedList {
//  public ListNode deleteDuplicates(ListNode head) {
//
//    ListNode copyHead = head;
//
//    if(copyHead == null)
//      return null;
//
//    while(copyHead != null && copyHead.next != null){
//      if(copyHead.val == copyHead.next.val){
//        copyHead.next = copyHead.next.next;
//      }
//      else
//        copyHead = copyHead.next;
//    }
//    return head;
//
//  }
//}


// ******************************************************************************