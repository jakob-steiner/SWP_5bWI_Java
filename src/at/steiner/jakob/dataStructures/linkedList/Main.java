
package at.steiner.jakob.dataStructures.linkedList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        MyLinkedList list = new MyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        list.print();
    
        System.out.println(" -");

        System.out.println(list.get(1));

        System.out.println(" -");

        list.remove(1);

        list.print();
    }
}