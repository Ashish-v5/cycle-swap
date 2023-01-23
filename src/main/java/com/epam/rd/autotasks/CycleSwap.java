package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int temp = array[0];
        for(int i=1;i<array.length;i++)
            array[i-1]=array[i];
        array[array.length-1]=temp;
    }

    static void cycleSwap(int[] array, int shift) {
        for(int i=0;i<shift;i++){
            cycleSwap(array);
        }
    }
}
