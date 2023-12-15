package at.steiner.jakob.sortAlgorithms.interfaces.algorithms;

import at.steiner.jakob.sortAlgorithms.interfaces.Algorithm;

public class InsertionSort implements Algorithm {

    public int[] sort(int[] data){
        for (int i = 1; i < data.length; i++){
            int cur = data[i];
            int j = i-1;
            while(j >= 0 && data[j] > cur){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = cur;
        }
        return data;
    }

}
