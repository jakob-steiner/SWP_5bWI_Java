package at.steiner.jakob.sortAlgorithms.interfaces.algorithms;

import at.steiner.jakob.sortAlgorithms.interfaces.Algorithm;

public class SelectionSort implements Algorithm {

    public int[] sort(int[] data){
        for (int i = 0; i < data.length; i++){
            int min = data[i];
            int minI = i;
            for (int j = i; j < data.length; j++){
                if(data[j] < min){
                    min = data[j];
                    minI = j;
                }
            }
            data[minI] = data[i];
            data[i] = min;
        }
        return data;
    }
}
