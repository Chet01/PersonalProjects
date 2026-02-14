package org.example.LinkedList;

public class DeleteMiddleNodeOfLinkedList {
    public static void main(String[] args){
         Node head = new Node(1);
         head.next = new Node(2);
         head.next.next = new Node(3);
         head.next.next.next = new Node(4);
         head.next.next.next.next = new Node(5);

         Node temp = head;

         while(temp!=null){
             System.out.println(temp.data);
             temp=temp.next;
         }

         Node node = deleteMiddleNode(head);
         reverseLinkedListt(head);

    }

    private static Node reverseLinkedListt(Node head) {
//      null->1->2->3->4->5
        Node prev = null;
        Node current = head;

        while(current!=null){
            Node newNode = current.next;
            current.next = prev;
            prev=current;
            current=newNode;
        }
         return prev;

    }

    private static Node deleteMiddleNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2;   // 0-based index

        temp = head;
        Node prev = null;
        int idx = 0;

        while (temp != null) {
            if (idx == mid) {
                prev.next = temp.next;   // delete middle
                break;
            }
            prev = temp;
            temp = temp.next;
            idx++;
        }

        return head;
    }

}
