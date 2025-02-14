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
    public int[] nextLargerNodes(ListNode head) {
        int size = 0;
        List<Integer> ll = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ll.add(temp.val);
            size++;
            temp = temp.next;
        }
        int n = ll.size();
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>(); 
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= ll.get(i)) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = st.peek();
            }
            st.push(ll.get(i));
        }
        return result;
    }

}