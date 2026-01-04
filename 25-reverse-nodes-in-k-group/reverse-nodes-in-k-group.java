/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;

        while (true) {
    
            ListNode temp = prevGroup;

        for(int i=0;i<k&&temp!=null;i++){
          temp=temp.next;
        }
        if(temp==null)
        break;
        ListNode groupStart = prevGroup.next;
            ListNode curr = groupStart.next;
            for (int i = 1; i < k; i++) {
                groupStart.next = curr.next;
                curr.next = prevGroup.next;
                prevGroup.next = curr;
                curr = groupStart.next;
            }
            prevGroup=groupStart;
    }
    return dummy.next;
    }
}