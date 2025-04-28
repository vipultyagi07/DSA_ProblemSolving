package topics.linkedList.doublyLinkedList;


/*

public class DNode {
    int data;

    DNode prev;
    DNode next;

    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

*/

public class L7_InsertionInDoublyLinkedList {

    public static void main(String[] args) {

        Node inputDL = generateDoublyLinkedList();
        int element= 69;
        int position= 3;



        inputDL = insertIntoDL(inputDL,element,position);

        printForward(inputDL);

        
    }

    private static Node insertIntoDL(Node head, int element, int position) {

        // Function to insert a new node at given position in doubly linked list.
            Node newNode = new Node(element);

            Node current = head;
            int count = 0;

            // Move to 'position'-th node
            while (current != null && count < position) {
                current = current.next;
                count++;
            }

            if (current == null) {
                // If current is null, inserting at the end
                return head;
            }

            newNode.next = current.next;
            newNode.prev = current;

            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;

            return head;


    }


    private static Node generateDoublyLinkedList() {

        Node head = new Node(1);

        Node current = head;

        current.next= new Node(2);
        current= current.next;

        current.next= new Node(3);
        current.prev=current;
        current= current.next;

        current.next= new Node(4);
        current.prev=current;
        current= current.next;

        current.next= new Node(5);
        current.prev=current;

        return head;

    }

    private static void printForward(Node head) {

        Node currentNode = head;

        System.out.print("null <-->");
        while(currentNode!=null){
            System.out.print(currentNode.data + "<-->");
            currentNode= currentNode.next;
        }
        System.out.println("null");

    }
    
}
