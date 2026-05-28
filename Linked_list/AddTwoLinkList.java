public class AddTwoLinkList {
    // /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         if(l1 == null){
//             return l2;
//         }
//         else if(l2 == null){
//             return l1;
//         }
//         ListNode h1= reverse(l1);
//         ListNode h2 = reverse(l2);
//         ListNode dummy = null;
//         int carry =0;
//         while(h1 != null || h2 != null){
//             int val1 = h1 == null ? 0 : h1.val;
//             int val2 = h2 == null ? 0 : h2.val;
            
//             int sum = val1 + val2 + carry;
//             int digit = sum %10;
//             carry = sum /10;

//             ListNode n = new ListNode(digit);
//             if(dummy == null){
//                 dummy = n;
//             }else{
//                 n.next = dummy;
//                 dummy = n;
//             }

//             if(h1 != null){
//                 h1 = h1.next;
//             }
//             if(h2 != null){
//                 h2 = h2.next;
//             }
//         }
//         if(carry > 0){
//             ListNode n = new ListNode(carry);
//             if(dummy == null){
//                 dummy = n;

//             }else{
//                 n.next = dummy;
//                 dummy = n;
//             }
//         }
//         return reverse(dummy);
//     }
//     public ListNode reverse(ListNode head){
//         if(head == null || head.next == null){
//             return head;
//         }
//         ListNode curr = head;
//         ListNode pre = null;
//         while(curr != null){
//             ListNode  nbr = curr.next;
//             curr.next = pre;
//             pre = curr;
//             curr = nbr;
//         }
//         return pre;
//     }
// }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            carry = sum / 10;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}
}
