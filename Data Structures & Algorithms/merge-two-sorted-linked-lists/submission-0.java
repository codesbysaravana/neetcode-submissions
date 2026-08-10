class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;

        // Start 'curr' at the dummy node itself
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // Loop while BOTH lists still have nodes to compare
        while (l1 != null && l2 != null) {
            
            // If l1 is smaller (or equal), attach l1 and move l1 forward
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } 
            // Otherwise, l2 is smaller. Attach l2 and move l2 forward
            else {
                curr.next = l2;
                l2 = l2.next;
            }
            
            // Advance the 'curr' pointer so it's ready for the next node
            curr = curr.next;
        }

        // If we ran out of nodes in one list, just attach the rest of the other list
        if (l1 != null) {
            curr.next = l1;
        } else if (l2 != null) {
            curr.next = l2;
        }

        // Return the actual head of the merged list (skipping our placeholder dummy node)
        return dummy.next;
    }
}