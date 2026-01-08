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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode sullu=new ListNode(0);
        sullu.next=head;
        ListNode prev=sullu;
        if(head==null){
            return null;

        }
        if(left==right){
            return head;
        }
        
        
       for(int i=1;i<left;i++){
        prev=prev.next;
       }

       
       ListNode curr=prev.next;
    //    ListNode Next=prev.next;
       
       
       for(int t=0;t<right-left;t++){
       ListNode  Next=curr.next;
        curr.next=Next.next;
         Next.next=prev.next;
        prev.next=Next;
        


       }
       return  sullu.next;
    }
}