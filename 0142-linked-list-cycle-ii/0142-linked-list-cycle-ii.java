/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode found=new ListNode();
        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        // int s=0,f=0;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            // s++;
            fast=fast.next.next;
            // f+=2;
            if(slow==fast){
                  slow=head;

            while(slow!=fast){
                
                slow=slow.next;
                fast = fast.next;
            }
            return slow;
                

            }

           
            // i++;
            // head1=head1.next;
        }
        //  int i=1;
        //

        return null;
    }
}