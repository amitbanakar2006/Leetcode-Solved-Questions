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
    public ListNode deleteMiddle(ListNode head) {
         if(head.next==null){
            return null;}
        if(head == null){
            return null;
        }
        
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode search=null;
        while(fast!=null && fast.next!=null ){
        //     if(fast.next.next==null){
        //         if(search!=slow){
        //             search=search.next;

        //         }search.next=search.next.next;
        //         // slow=head;
        //        // slow=slow.next.next;
        //         return head;
                
        //     }

            search=slow;
            slow=slow.next;
            fast=fast.next.next;

        }
        // while(search.next!=slow){
        //     search=search.next;
        // }
        if(search==null)
{
    return null;
}        search.next=slow.next;
       
        // slow=slow.next;
        return head;
        
    }
}