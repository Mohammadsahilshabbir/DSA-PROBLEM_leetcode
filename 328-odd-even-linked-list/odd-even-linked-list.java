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
    public ListNode oddEvenList(ListNode head) {
        ListNode edm=new ListNode(-1);
        ListNode odm=new ListNode(-1);
        ListNode temp=head;
        ListNode t1=edm;
        ListNode t2=odm;
        int idx=1;
        while(temp!=null){
            if(idx%2==0){
                t2.next=temp;
                t2=t2.next;
            }else{
                t1.next=temp;
                t1=t1.next;
            }
            temp=temp.next;
            idx++;
        }
        t2.next=null;
        t1.next=odm.next;
        return edm.next;
    }
}