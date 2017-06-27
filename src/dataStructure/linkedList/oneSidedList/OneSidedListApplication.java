package dataStructure.linkedList.oneSidedList;

import dataStructure.linkedList.Link;

public class OneSidedListApplication {
    public OneSidedListApplication() {
        System.out.println("--- Insert 1, 2, 3 ---");
        LinkList list = new LinkList();
        list.insert(1, 10);
        list.insert(2, 11);
        list.insert(3, 12);
        list.displayAll();
        System.out.println("--- Find 2 ---");
        Link findLink = list.find(2);
        if (findLink != null) findLink.display();
        System.out.println("--- Delete 2 ---");
        list.delete(2);
        list.displayAll();
        System.out.println("--- Delete 3 ---");
        list.delete(3);
        list.displayAll();

    }
}
