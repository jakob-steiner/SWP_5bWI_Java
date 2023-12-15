package at.steiner.jakob.sortAlgorithms.interfaces.algorithms;

import at.steiner.jakob.sortAlgorithms.interfaces.Algorithm;

public class BubbleSort implements Algorithm {


    @Override
    public int[] sort(int[] data) {
        boolean changed = false;
        do{
            changed = false;
            for (int i = 1; i < data.length; i++){
                if(data[i] < data[i-1]){
                    changed = true;
                    int greater = data[i-1];
                    int lower = data[i];
                    data[i] = greater;
                    data[i-1] = lower;
                }
            }
        }while(changed);

       return data;
    }
}
