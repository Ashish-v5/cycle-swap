package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int n =array.length;
        int temp = array[n-1];
        for(int i=n-1;i>0;i--)
            array[i]=array[i-1];
        array[0]=temp;
    }

    static void cycleSwap(int[] array, int shift) {
        for(int i=0;i<shift;i++){
            cycleSwap(array);
        }
    }
}
