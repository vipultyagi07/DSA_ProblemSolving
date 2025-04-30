package topics.linkedList.doublyLinkedList;


public class L6_DeletionInLinkedList {
    public static void main(String[] args) {

        Node dLinkedList =null;


        // Question 1: Delete head of the Doubly Linked List

         dLinkedList = generateDoublyLinkedList();
         dLinkedList = removeHead(dLinkedList);
         printForward(dLinkedList);


        // Question 2: Delete tail of the Doubly Linked List

        dLinkedList = generateDoublyLinkedList();
        dLinkedList = removeTail(dLinkedList);
        printForward(dLinkedList);

        // Question 3: Delete nth node  of the Doubly Linked List

        dLinkedList = generateDoublyLinkedList();
        dLinkedList = removeNthNode(dLinkedList,1);
        printForward(dLinkedList);




    }




    private static Node removeHead(Node head) {
        head= head.next;
        head.prev=null;
        return head;

    }

    private static Node removeTail(Node head) {

        Node current = head;



        while(current.next.next!=null){
            current = current.next;
        }
        current.next=null;

        return head;


    }

    private static Node removeNthNode(Node head, int k) {

        int count =0;
        Node current= head;
        if(head==null){
            return null;
        }
        if(k==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        while(count!=k-2){

            current= current.next;
            count++;

        }

        current.next= current.next.next;

        if(current.next!=null) {
            current.next.prev = current;
        }
        return head;
    }



    private static  Node generateDoublyLinkedList() {

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
