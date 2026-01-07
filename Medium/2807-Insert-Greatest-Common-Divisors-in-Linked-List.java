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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        ListNode currentit = head;


        while(currentit!=null){
            if(currentit.next==null ) {
                current.next = new ListNode(currentit.val);
                break;
            };

            current.next = new ListNode(currentit.val,new ListNode(gcd(currentit.val,currentit.next.val)));
            current = current.next.next;
            currentit = currentit.next;
        }

        return dummy.next;
    }

    int gcd(int a, int b)
    {
        return b==0?a:gcd(b,a%b);
    }
}