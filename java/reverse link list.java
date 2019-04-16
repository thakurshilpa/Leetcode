/*Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr,nextt,pre;
        curr=head;
        nextt=null;
        pre=null;
        while(curr!=null)
        {
            nextt=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nextt;
        }
       // head=curr;
        return pre;
        
    }
}