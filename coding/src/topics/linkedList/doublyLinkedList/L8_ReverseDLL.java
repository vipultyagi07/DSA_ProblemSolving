package topics.linkedList.doublyLinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L8_ReverseDLL {

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push(10);
        dll.push(20);
        dll.push(30);
        dll.push(40);

        System.out.println("Original list:");
        dll.printList();

        dll.reverse();

        System.out.println("Reversed list:");
        dll.printList();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        List<Integer> list2=list;

        list.sort(Comparator.reverseOrder());

        if(list2.equals(list)){
            System.out.println("yessss");
        }

    }

    private static Node reverseTheDLL(Node head) {
        Node current = head;
        Node newHead = null;

        while (current != null) {
            // Swap prev and next
            Node temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Set newHead to current node (will eventually be the last node processed)
            newHead = current;

            // Move to next node (which is prev due to the swap)
            current = current.prev;
        }

        return newHead;
    }

}

class DoublyLinkedList {
    Node head;

    // Function to reverse the doubly linked list
    void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            // Swap next and prev
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to next node (which is previous before swap)
            current = current.prev;
        }

        // After the loop, temp is at the new head
        if (temp != null) {
            head = temp.prev;
        }
    }

    // Helper methods to add nodes and print list
    void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
    }

    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
