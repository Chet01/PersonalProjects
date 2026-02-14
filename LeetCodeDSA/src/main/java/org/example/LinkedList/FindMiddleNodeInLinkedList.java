package org.example.LinkedList;

public class FindMiddleNodeInLinkedList {
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node temp = head;
        int count=0;

        while (temp != null) {
            System.out.println(temp.data);
            count++;
            temp = temp.next;
        }

        int mid = count / 2+1;

        temp=head;

        while (temp != null) {
            mid = mid - 1;

            // Check if the middle
            // position is reached.
            if (mid == 0){
                // break out of the loop
                // to return temp
                System.out.println("The middle node data : "+temp.data);
                break;
            }
            // Move temp ahead
            temp = temp.next;
        }

        Node newHead = reverseLinkedList(head);
        while(newHead!=null){
            System.out.println(newHead.data);
            newHead = newHead.next;
        }


    }

    static Node reverseLinkedList(Node head) {
//     prev = null    1->2->3->4->5
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node newNode = current.next;
            current.next = prev;
            prev=current;
            current=newNode;
        }
        return prev; // new head
    }

}
