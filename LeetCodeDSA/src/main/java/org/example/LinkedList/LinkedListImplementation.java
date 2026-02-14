package org.example.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args){
        int[] array = {1,2,3,4};
        Node node = new Node(array[1]);
        System.out.println(node.data);
        System.out.println(node.next);
        Node head = new Node(array[0]);
        Node mover = head;
        for(int i=1;i<array.length;i++){
            Node temp = new Node(array[i]);
            mover.next = temp;
            mover=temp;
        }
        System.out.println(head);

        Node temp = head;

        while(temp!=null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

        }

    }


