package topics.linkedList;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L2_SearchInALinkedList {

    public static void main(String[] args) {
        // make a linked list manually

        Node1 head=new Node1(2);

        Node1 current= head;
        current.next=new Node1(3);
        current=current.next;
        current.next= new Node1(4);


//        System.out.println(searchInLinkedList(head,4));
        System.out.println(searchInLinkedList(head,4));


    }





    /**
 * Search Element in LinkedList.
 * <p>
 * <b>Example:</b>
 * <pre>
 * <a href="https://www.naukri.com/code360/problems/search-in-a-linked-list_975381?leftPanelTabValue=PROBLEM" target="_blank">Search in Linked list</a>.
 * I/P: [1, 2, 3, 4, 5]
 * O/P: 1->2->3->4->5
 * </pre>
 * </p>
 * <p>
 * For more details, refer to:
 * <a href="https://drive.google.com/file/d/17GnzzTXPAIJCJI0tCyKpv6sHbTDJtPTX/view?usp=sharing" target="_blank">For Visualization of filling the element in LL</a>.
 * </p>
 *
 */

    public static boolean searchInLinkedList(Node1 head, int k) {
        while (head != null) {
            if(head.data==k){
               return true;
            }
            head = head.next;
        }


        return false;
    }




}

