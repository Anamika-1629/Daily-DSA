import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {

    // Delete Middle Node
    public ListNode deleteMiddle(ListNode head) {

        // If list has only one node
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node
        prev.next = slow.next;

        return head;
    }

    // Print Linked List
    public void printList(ListNode head) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class DeleteMiddleNodeOfLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        System.out.println("Enter node values:");

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            ListNode newNode = new ListNode(x);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Solution obj = new Solution();

        System.out.print("Original List: ");
        obj.printList(head);

        head = obj.deleteMiddle(head);

        System.out.print("After Deleting Middle: ");
        obj.printList(head);

        sc.close();
    }
}

