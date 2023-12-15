package at.steiner.jakob.sortAlgorithms.interfaces;

import at.steiner.jakob.sortAlgorithms.interfaces.algorithms.BubbleSort;
import at.steiner.jakob.sortAlgorithms.interfaces.algorithms.InsertionSort;
import at.steiner.jakob.sortAlgorithms.interfaces.algorithms.RadixSort;
import at.steiner.jakob.sortAlgorithms.interfaces.algorithms.SelectionSort;

public class Main {
    public static void main(String[] args) {


        Sorter sorter = new Sorter();
        BubbleSort bs = new BubbleSort();
        SelectionSort selSort = new SelectionSort();
        InsertionSort is = new InsertionSort();
        RadixSort rs = new RadixSort();

        sorter.setAlgorithm(rs);

        DataGenerator.printArray(sorter.doSort(DataGenerator.generateData(40, 5, 30)));


    }
}
