package dataStructure.linkedList;

public class Link {
    public int id;
    public double dData;
    public Link next;

    public Link(int id, double dData) {
        this.id = id;
        this.dData = dData;
    }
    public void display(){
        System.out.println("id " + id + ", dData " + dData);
    }
}
