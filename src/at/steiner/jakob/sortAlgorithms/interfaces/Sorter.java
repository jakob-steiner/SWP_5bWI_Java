package at.steiner.jakob.sortAlgorithms.interfaces;

import at.steiner.jakob.sortAlgorithms.interfaces.Algorithm;

public class Sorter {

    private Algorithm algorithm;

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public int[] doSort(int[] data){
        return algorithm.sort(data);
    }
}
