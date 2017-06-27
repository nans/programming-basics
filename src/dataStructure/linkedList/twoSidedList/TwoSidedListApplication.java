package dataStructure.linkedList.twoSidedList;

import dataStructure.linkedList.Link;

public class TwoSidedListApplication {
    public TwoSidedListApplication() {
        System.out.println("----- Insert 1, 2, 3 -----");
        LinkListTwoSided list = new LinkListTwoSided();
        list.insertFirst(1, 1);
        list.insertFirst(2, 2);
        list.insertLast(3, 3);
        list.displayAll();
        System.out.println("----- Find 2 -----");
        Link findLink = list.find(2);
        if (findLink != null) findLink.display();
        System.out.println("----- Delete 1 -----");
        list.delete(1);
        list.displayAll();
        System.out.println("----- Delete 2 -----");
        list.delete(2);
        list.displayAll();
    }
}
