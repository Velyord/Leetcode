/*
Task:
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.
Example 1:
    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]
Example 2:
    Input: list1 = [], list2 = []
    Output: []
Example 3:
    Input: list1 = [], list2 = [0]
    Output: [0]
Constraints:
    The number of nodes in both lists is in the range [0, 50].
    -100 <= Node.val <= 100
    Both list1 and list2 are sorted in non-decreasing order.
 */
package src;

import static java.lang.System.out;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode();
        ListNode list4 = new ListNode();
        ListNode list5 = new ListNode();
        ListNode list6 = new ListNode(0);

        ListNode mergedList1 = mergeTwoLists(list1, list2);
        ListNode mergedList2 = mergeTwoLists(list3, list4);
        ListNode mergedList3 = mergeTwoLists(list5, list6);

        out.println("Your Output:");
        showResult(mergedList1);
        showResult(mergedList2);
        showResult(mergedList3);

        out.println("\nExpected Output:\n[1,1,2,3,4,4]\n[0,0]\n[0,0]");
    }

    private static void showResult(ListNode mergedList1) {
        StringBuilder result = new StringBuilder("[");

        while (mergedList1 != null) {
            result.append(mergedList1.val);

            if (mergedList1.next != null) {
                result.append(",");
            }

            mergedList1 = mergedList1.next;
        }

        result.append("]");

        out.println(result);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        ListNode current1 = list1;
        ListNode current2 = list2;

        // Traverse both lists and append nodes to the combined list
        while (current1 != null || current2 != null) {
            if (current1 != null && (current2 == null || current1.val <= current2.val)) {
                current.next = current1;
                current1 = current1.next;
            } else {
                current.next = current2;
                current2 = current2.next;
            }
            current = current.next;
        }

        // Return the head of the combined list (excluding the dummy node)
        return dummyHead.next;
    }
}
