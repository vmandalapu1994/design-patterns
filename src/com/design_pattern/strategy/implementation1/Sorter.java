package com.design_pattern.strategy.implementation1;

public class Sorter {

    private SortingStrategy sortingStrategy;

    public Sorter(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public Sorter() {
        this.sortingStrategy = new BubbleSort();
    }

    void sort(int[] arr) {
        sortingStrategy.sort(arr);
    }


}
