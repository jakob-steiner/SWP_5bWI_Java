package at.steiner.jakob.sortAlgorithms.interfaces;

import java.util.Random;

public class DataGenerator {

    public static int[] generateData(int size){
        int[] data = new int[size];
        for(int i = 0; i < size; i++){
            data[i] = (int)(Math.random()*1000);
        }
        return data;
    }

    public static int[] generateData(int size, int min, int max){
        int[] data = new int[size];
        Random random = new Random();
        for(int i = 0; i < size; i++){
            data[i] = random.nextInt(max + 1 - min) + min;
        }
        return data;
    }

    public static void printArray(int[] data){
        for (int item: data){
            System.out.println(item);
        }
    }
}
