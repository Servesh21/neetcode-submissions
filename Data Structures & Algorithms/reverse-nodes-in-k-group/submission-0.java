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
    public ListNode getKthnode(ListNode temp,int k){
        k -= 1;
        while(temp!=null && k>0){
            temp = temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reversek(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!= null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;

        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode  temp = head;
      ListNode prev = null;
      while(temp != null){
        ListNode kth = getKthnode(temp,k);
        if(kth == null) {
        if(prev != null) prev.next = temp;
        break;
        }
        ListNode newnode = kth.next;
        kth.next = null;
        reversek(temp);
        if(temp == head) head = kth;
        else{
            prev.next = kth;
        }
        prev = temp;
        temp = newnode;
      }
      return head;
    }
}