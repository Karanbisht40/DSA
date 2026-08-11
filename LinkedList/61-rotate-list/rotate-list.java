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
    public ListNode rotateRight(ListNode head, int k) {
        if(head== null || k==0) return head;
        ListNode tail = head;
         int len =1;
        while(tail.next != null){
            tail = tail.next;
            len +=1;
        }
        if(k % len ==0 ) return head;
        //unnessary roation
         k= k % len;

         tail.next = head;

         //find new tail
         int step = len-k;
           ListNode newTail = head;

         for(int i =1; i<step; i++){
             newTail = newTail.next;
         }

               ListNode newHead = newTail.next;
             newTail.next = null;

        return newHead;

    }
}