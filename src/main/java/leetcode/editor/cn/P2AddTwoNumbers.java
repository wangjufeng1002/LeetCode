//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学

package leetcode.editor.cn;

import java.util.List;

//Java：两数相加
public class P2AddTwoNumbers{
    public static void main(String[] args) {
        Solution solution = new P2AddTwoNumbers().new Solution();
        ListNode l1 = new ListNode(1); ListNode l11 = new ListNode(8);
        ListNode l2 = new ListNode(0);
        l1.next = l11;

        solution.addTwoNumbers(l1,l2);
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode resultListNode = listNode;
        int l1Temp,l2Temp,k=0;
        while(l1 != null || l2 != null){
            if(l1 == null){
                l1Temp = 0;
            }else {
                l1Temp = l1.val;
                l1 = l1.next;
            }
            if(l2 == null){
                l2Temp = 0;
            }else {
                l2Temp = l2.val;
                l2 = l2.next;
            }
            int i = l1Temp + l2Temp + k;
            if(i<10){
                listNode.next = new ListNode(i);
                listNode = listNode.next;
                k=0;
            }else{
                listNode.next = new ListNode(i%10);
                listNode = listNode.next;
                k=1;
            }
        }
        if(k != 0){
            listNode.next = new ListNode(k);
        }
        return resultListNode.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}