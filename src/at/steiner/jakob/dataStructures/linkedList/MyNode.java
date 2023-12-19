package at.steiner.jakob.dataStructures.linkedList;

public class MyNode {
    private int value;
    private MyNode next;

    public MyNode(int value) {
        this.value = value;
    }

    public MyNode(int value, MyNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

    public MyNode getNext() {
        return this.next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
