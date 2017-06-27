package dataStructure.linkedList.doublyLinked;

public class Node {
    public long dData;
    public Node next;
    public Node previous;

    public Node(long dData) {
        this.dData = dData;
    }
    public void display(){
        System.out.println("Data " + dData);
    }
}
