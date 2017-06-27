package dataStructure.linkedList.twoSidedList;

import dataStructure.linkedList.Link;

public class LinkListTwoSided {
    private Link first;
    private Link last;

    public LinkListTwoSided() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, double data) {
        Link newLink = new Link(id, data);
        if (isEmpty()) {
            last = newLink;
            newLink.next = first;
            first = newLink;
        } else {
            newLink.next = first;
            first = newLink;
        }
    }

    public void insertLast(int id, double data) {
        Link newLink = new Link(id, data);
        if (first == null) {
            first = newLink;
        } else {
            last.next = newLink;
            last = newLink;
        }
    }

    public void displayAll() {
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    public Link find(int id) {
        if (first == null) return null;
        Link current = first;
        while (current.id != id) {
            if (current.next == null) return null;
            current = current.next;
        }
        return current;
    }

    public void delete(int id) {
        if (first == null) return;
        Link current = first;
        Link previous = first;

        while (current.id != id) {
            if (current.next == null) return;
            previous = current;
            current = current.next;
        }


        if (current == first) {
            if (last == first) {
                last = null;
            }
            first = first.next;
        } else {
            if (current == last) {
                last = previous;
            }
            previous.next = current.next;
        }
    }
}
