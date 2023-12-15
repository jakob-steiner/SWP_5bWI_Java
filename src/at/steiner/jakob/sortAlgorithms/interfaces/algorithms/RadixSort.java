package at.steiner.jakob.sortAlgorithms.interfaces.algorithms;

import at.steiner.jakob.sortAlgorithms.interfaces.Algorithm;

public class RadixSort implements Algorithm {

    public int[] sort(int[] data){
        int max = data[0];
        for (int i = 1; i < data.length; i++){
            if(data[i] > max){
                max = data[i];
            }
        }
        int digits = 0;
        while(max > 0){
            digits++;
            max /= 10;
        }
        int[][] buckets = new int[10][data.length];
        int[] bucketSizes = new int[10];
        for (int i = 0; i < digits; i++){
            int exp = (int) Math.pow(10, i);
            for (int j = 0; j < data.length; j++){
                int digit = data[j] / exp % 10;
                buckets[digit][bucketSizes[digit]] = data[j];
                bucketSizes[digit]++;
            }
            int index = 0;
            for (int j = 0; j < buckets.length; j++){
                for (int k = 0; k < bucketSizes[j]; k++){
                    data[index] = buckets[j][k];
                    index++;
                }
                bucketSizes[j] = 0;
            }
        }
        return data;
    }
}
