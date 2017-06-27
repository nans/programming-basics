package dataStructure.linkedList.doublyLinked;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        Node newNode = new Node(dd);
        if (isEmpty())
            last = newNode;
        else
            first.previous = newNode;
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(long dd) {
        Node newNode = new Node(dd);
        if (isEmpty())
            first = newNode;
        else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(long key, long dd) {
        Node current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return false;
        }
        Node newLink = new Node(dd);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Node deleteKey(long key) {
        Node current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return null;
        }
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward(){
        System.out.println("List (first-->last): ");
        Node current = first;
        while(current != null){
            current.display();
            current = current.next;
        }
    }

    public void displayBackward(){
        System.out.println("List last--->first ");
        Node current = last;
        while(current != null){
            current.display();
            current = current.previous;
        }
    }
    //223
}
