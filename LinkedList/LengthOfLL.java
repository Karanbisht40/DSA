package LinkedList;

public class Solution {
    public int getLength(ListNode head) {
        int cnt = 0;
        ListNode temp= head;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
} {
    
}
