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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //we are doing it in one pass using two pointers 
        // basically first pointer goes forward n times 
        // and then we instantiate the second pointer to start
        // from the head and no move both the pointers till the
        // first pointer reaches the end GOOD!!!!!
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;
        ListNode temp_back = dummy;
        // Move temp n steps forward
        for (int i = 0; i <= n; i++) {
            temp = temp.next;
        }
        // Move both pointers until temp reaches the end
        while (temp != null) {
            temp = temp.next;
            temp_back = temp_back.next;
        }
        // Remove the nth node from the end
        temp_back.next = temp_back.next.next;

        return dummy.next; // Return the updated list
    }

    
}