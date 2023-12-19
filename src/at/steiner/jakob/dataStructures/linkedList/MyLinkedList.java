package at.steiner.jakob.dataStructures.linkedList;

public class MyLinkedList implements MyList {

    private MyNode initNode;
    private int size;

    public MyLinkedList() {
        this.initNode = null;
        this.size = 0;
    }

    @Override
    public void add(int value) {
        
        if (this.initNode == null) {
            this.initNode = new MyNode(value);
        } else {
            MyNode currentNode = this.initNode;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new MyNode(value));
        }
        this.size++;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        MyNode currentNode = this.initNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getValue();
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            this.initNode = this.initNode.getNext();
        } else {
            MyNode currentNode = this.initNode;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(currentNode.getNext().getNext());
        }
        this.size--;
    }

    @Override
    public void print() {
        MyNode currentNode = this.initNode;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

}
