package MergeTwoSortedLL;

public class Solution {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode current1, ListNode current2) {
        //create dummy head Node;
        ListNode tempHead=new ListNode();
        ListNode prev = tempHead;
        while (current1!=null && current2!=null){
            if (current1.val <=current2.val){
                prev.next=current1;
                current1=current1.next;

            }else {
                prev.next=current2;
                current2=current2.next;
            }
            prev = prev.next;
        }
        //now check if any leftover
        if (current1==null) prev.next = current2;
        else prev.next=current1;
        return tempHead.next;



    }
}