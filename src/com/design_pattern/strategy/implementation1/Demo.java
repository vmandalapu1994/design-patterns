package com.design_pattern.strategy.implementation1;

public class Demo {

    public static void main(String[] args) {
        Sorter bubbleSortsorter = new Sorter(new BubbleSort());
        bubbleSortsorter.sort(new int[]{10, 20, 30});


        Sorter selectionSorter = new Sorter(new SelectionSort());
        selectionSorter.sort(new int[]{1, 3, 4, 9});
    }

}
