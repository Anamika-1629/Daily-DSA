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

    // Reverse Linked List
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // Save next node
            curr.next = prev;          // Reverse link
            prev = curr;               // Move prev
            curr = next;               // Move curr
        }

        return prev;
    }

    // Print Linked List
    public void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

}

public class ReverseLinkedList {
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

        head = obj.reverseList(head);

        System.out.print("Reversed List: ");
        obj.printList(head);

        sc.close();
    }
}
