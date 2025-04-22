package topics.linkedList;

class Node4{
    int data;
    Node4 next;
    
    Node4(int data ){
        this.data=data;
        next=null;
    }
}

/**
 *  Insertion at Nth index  in linked list
 * <pre>
 *  I/P: inputNode = 1->2->3->4->5->6, insertNode = 6533->null, position 2
 *  O/P: 1->2->6533->3->4->5->6->null
 * </pre>
 *
 * For more details, refer to:
 * <a href="https://drive.google.com/file/d/1NZ4LUEBN1QMlrtOFSaIdFPUUkJw-MdJ6/view?usp=sharing" target="_blank">For Visualization go to Q3</a>.
 * </p>
 *
 */

public class L4_InsertionINLinkedList {

    public static void main(String[] args) {

        Node4  inputNode = getFreshLinkedList();
        Node4 insertNode = new Node4(6533);
        int position= 2;

        Node4 result = insertAtNthPosition(inputNode,insertNode,position);
        printLinkedList(result);
        
        

        
    }


    private static Node4 insertAtNthPosition(Node4 head, Node4 insertNode, int position) {

        if(head == null){
            return insertNode;
        }

        Node4 current = head;
        int count=0;

        while((count)!=position-1){

            current= current.next;
            count++;
        }

        insertNode.next=current.next;
        current.next=insertNode;
        return head;


    }


    private static Node4 getFreshLinkedList() {
        Node4 head=new Node4(1);

        Node4 current= head;
        current.next=new Node4(2);
        current=current.next;
        current.next= new Node4(3);
        current=current.next;
        current.next= new Node4(4);
        current=current.next;
        current.next= new Node4(5);
        current=current.next;
        current.next= new Node4(6);
        return head;
    }

    private static void printLinkedList(Node4 head){
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
