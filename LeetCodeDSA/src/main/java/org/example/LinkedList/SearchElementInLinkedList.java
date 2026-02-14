package org.example.LinkedList;

public class SearchElementInLinkedList {

    public static void main(String[] args) {

        int[] array = {12, 10, 0, 5};

        // 1. Convert array to linked list
        Node head = convertArrayToLinkedList(array);
        Node temp = head;
        while(temp!=null){
            System.out.println("After conversion : "+temp.data);
            System.out.println("After conversion : "+temp.next);
            System.out.println("------------------------------");
            temp = temp.next;
        }

//         2. Search element
        boolean status = isElementFound(head, 10);
        System.out.println("Is 10 found? " + status);
        System.out.println("-----------------------");

        // 3. Insert at head
        head = insertAtHead(head, 19);

        // 4. Delete at tail
        head = deleteAtTail(head);

        System.out.println("Data after deletion : ");
        System.out.println("-----------------------");

        Node temp1 = head;

        while(temp1!=null){
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }

        // 5. Copy linked list & count size

    }

    private static Node deleteAtTail(Node head) {
        // If list is empty or has one node
        if (head == null || head.next == null) {
            return null;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        // Delete tail node
        current.next = null;

        // Return updated head
        return head;
    }

    private static Node insertAtHead(Node head, int i) {
        Node newNode = new Node(i);
        newNode.next=head;
        return newNode;
    }

    private static boolean isElementFound(Node head, int i) {
        Node newNode = new Node(head.data);
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==i){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    private static Node convertArrayToLinkedList(int[] array) {
        Node head = new Node(array[0]);
        Node mover = head;
        for(int i=1;i<array.length;i++){
            Node temp = new Node(array[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }

    // ----------------- Helper Methods -----------------


}