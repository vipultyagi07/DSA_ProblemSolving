package topics.linkedList.doublyLinkedList;

public class Node {
    int data;

    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
