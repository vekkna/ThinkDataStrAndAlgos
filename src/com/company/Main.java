package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

         var sorter = new SelectionSort<Integer>();
         var arr = new Integer[]{3, 6, 2, 7,3 };
         sorter.Sort(arr);
         System.out.println(Arrays.toString(arr));
    }
}
