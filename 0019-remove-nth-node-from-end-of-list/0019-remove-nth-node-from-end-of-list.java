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
        ListNode curr=head;
        if(head.next==null){
            return null;
        }
        int a=0;
        while(curr!=null){
            curr=curr.next;
            a++;
        }
        int N=a-n;
        int x=1;
        ListNode curr2=head;
        if(a==n){
            return curr2.next;
        }
        
     while (curr2.next!=null && x<N){
            curr2=curr2.next;
            x++;



        }
        curr2.next=curr2.next.next;
        return head;
       



   
        
    }
}