package dataStructure.linkedList.oneSidedList;

import dataStructure.linkedList.Link;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(int id, double data) {
        Link newLink = new Link(id, data);
        if (first == null) {
            first = newLink;
        } else {
            Link currentLink = first;
            while (currentLink.next != null) {
                currentLink = currentLink.next;
            }
            currentLink.next = newLink;
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
            first = first.next;
        } else {
            previous.next = current.next;
        }
    }
}
