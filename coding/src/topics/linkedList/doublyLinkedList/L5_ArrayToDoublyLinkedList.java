package topics.linkedList.doublyLinkedList;

/*
   class Node {
    int data;
    Node previous;
    Node next;

    Node(int data){
        this.data=data;
        this.previous=null;
        this.next=null;
    }
}*/
/**
 *  Array to Doubly linked list
 * <pre>
 *  I/P:  input =  [1,2,3,4,5]
 *  O/P:  Output =  null <-->1<-->2<-->3<-->4<-->5<-->null
 * </pre>
 *
 * For more details, refer to:
 * <a href="https://drive.google.com/file/d/1d7GrHce02iDa7dHNon7_NHLh0-qzXtE2/view?usp=sharing" target="_blank">For Visualization</a>.
 * </p>
 *
 */

public class L5_ArrayToDoublyLinkedList {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        Node result = ArrayToLinkedList(arr);

        printForward(result);
        printBackward(result);

    }

    private static void printBackward(Node head) {

        Node currentNode = head;

        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }

        System.out.print("null <-->");
        while (currentNode !=null) {

            System.out.print(currentNode.data + "<-->");
            currentNode = currentNode.prev;
        }
        System.out.println("null");
    }

    private static void printForward(Node head) {

       Node currentNode = head;

       System.out.print("null <-->");
       while(currentNode !=null){
           System.out.print(currentNode.data + "<-->");
           currentNode = currentNode.next;
       }
       System.out.println("null");

    }

    private static Node ArrayToLinkedList(int[] arr) {

        Node head = new Node(arr[0]);
        Node current = head;

        Node newNode = new Node(arr[1]);
        current.next= newNode;
        newNode.prev= current;

        current= newNode;

        for(int i=2;i<arr.length;i++){
            newNode = new Node(arr[i]);
            current.next= newNode;
            newNode.prev= current;
            current= newNode;

        }

        return head;
    }
}
