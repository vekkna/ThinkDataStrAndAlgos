package com.company;

public class SelectionSort<T extends Comparable<? super T>> {

    private void SwapElements(T[] arr, int a, int b){
            T temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
    }

    private int IndexOfLowest(T[] arr, int startIndex){
        int lowIndex = startIndex;
        for (int i = startIndex + 1; i < arr.length; i++) {
            if(arr[i].compareTo(arr[lowIndex]) < 0){
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    public void Sort(T[] arr){
        for (int i = 0; i < arr.length; i++){
            int j = IndexOfLowest(arr, i);
            SwapElements(arr, i, j);
        }
    }
}