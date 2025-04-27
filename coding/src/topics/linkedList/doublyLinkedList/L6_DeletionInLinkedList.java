package topics.linkedList.doublyLinkedList;


class Node1{

    int data;
    Node1 prev;
    Node1 next;

    Node1(int data){
        this.data=data;
    }
}

public class L6_DeletionInLinkedList {
    public static void main(String[] args) {

        Node1 dLinkedList =null;


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




    private static Node1 removeHead(Node1 head) {
        head= head.next;
        head.prev=null;
        return head;

    }

    private static Node1 removeTail(Node1 head) {

        Node1 current = head;



        while(current.next.next!=null){
            current = current.next;
        }
        current.next=null;

        return head;


    }

    private static Node1 removeNthNode(Node1 head, int k) {

        int count =0;
        Node1 current= head;
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



    private static  Node1 generateDoublyLinkedList() {

        Node1 head = new Node1(1);

        Node1 current = head;

        current.next= new Node1(2);
        current= current.next;

        current.next= new Node1(3);
        current.prev=current;
        current= current.next;

        current.next= new Node1(4);
        current.prev=current;
        current= current.next;

        current.next= new Node1(5);
        current.prev=current;

        return head;

    }

    private static void printForward(Node1 head) {

        Node1 currentNode = head;

        System.out.print("null <-->");
        while(currentNode!=null){
            System.out.print(currentNode.data + "<-->");
            currentNode= currentNode.next;
        }
        System.out.println("null");

    }


}
