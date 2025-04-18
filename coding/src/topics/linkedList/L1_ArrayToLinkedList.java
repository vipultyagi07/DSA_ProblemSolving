package topics.linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L1_ArrayToLinkedList {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        Node head = convert(arr);  // Convert array to linked list

        printList(head);  // Output: 10 → 20 → 30 → 40 → null
    }




/**
 * Convert Array into LinkedList.
 * <p>
 * <b>Example:</b>
 * <pre>
 * <a href="https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1" target="_blank">Array to Linked List</a>.
 * I/P: [1, 2, 3, 4, 5]
 * O/P: 1->2->3->4->5
 * </pre>
 * </p>
 * <p>
 * For more details, refer to:
 * <a href="https://drive.google.com/file/d/18FPwdsMpmBvN_BVx2fndbr6HjYrcVLac/view?usp=sharing" target="_blank">For Visualization</a>.
 * </p>
 *
 */

    // Convert array to linked list and return head
    public static Node convert(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);  // First element
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " → ");
            head = head.next;
        }
        System.out.println("null");
    }


}

