package topics.linkedList;

class Node2{

    int data;
    Node2 next;

    Node2(int data){
        this.data=data;
        this.next=null;
    }
}


/**
 *  Four method of deletion in linked list
 *  <br>
 *  <br>
 * For more details, refer to:
 * <a href="https://drive.google.com/file/d/1HkYQg_HJE4vrBKtWr8Szx3GGpfhTJtrj/view?usp=sharing" target="_blank">For Visualization</a>.
 * </p>
 *
 */

public class L3_DeletionInLinkedList {

    public static void main(String[] args) {

        Node2 headA= getFreshLinkedList();
        // delete Head
        headA = deleteHead(headA);
        printLinkedList(headA);

        Node2 headB= getFreshLinkedList();
        // delete Tail
        headB = deleteTail(headB);
        printLinkedList(headB);

        Node2 headC= getFreshLinkedList();
        // delete  3rd node
        headC = deleteNthNode(headC,3);
        printLinkedList(headC);

        Node2 headD= getFreshLinkedList();
        // delete node which have the value 1
        headD = deleteXdataNode(headD,1);
        printLinkedList(headD);

    }


    private static Node2 deleteHead(Node2 head) {

        if(head==null){
            return null;
        }
        return head.next;
    }

    private static Node2 deleteTail(Node2 head) {

        if(head==null){
            return null;
        }
        Node2 current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        return head;
    }

    private static Node2 deleteNthNode(Node2 head, int k) {

        if(head==null){
            return null;
        }
        if(k==1){
            head=head.next;
            return head;
        }
        Node2 current=head;
        int count=0;

        while(current!=null){
            current=current.next;
            count++;
            if(count+2==k){
                break;
            }
        }
        if(current.next==null){
            return head;
        }

        current.next=current.next.next;
        return head;
    }

    private static Node2 deleteXdataNode(Node2 head, int value) {

        if(head==null){
            return null;
        }
        if(head.data==value){
            head=head.next;
            return head;
        }
        Node2 current=head;
        int count=0;

        while(current.next.data==value){
            current=current.next;

        }
        if(current.next==null){
            return head;
        }

        current.next=current.next.next;
        return head;
    }



    private static Node2 getFreshLinkedList() {
        Node2 head=new Node2(1);

        Node2 current= head;
        current.next=new Node2(2);
        current=current.next;
        current.next= new Node2(3);
        current=current.next;
        current.next= new Node2(4);
        current=current.next;
        current.next= new Node2(5);
        current=current.next;
        current.next= new Node2(6);
        return head;
    }

    private static void printLinkedList(Node2 head){
        if(head==null){
            System.out.println("No data");
        }

        while(head!=null){

            System.out.print(head.data+"->");
            head= head.next;
        }
        System.out.println("null");
    }
}
