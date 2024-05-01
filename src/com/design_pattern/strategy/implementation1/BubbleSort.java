package com.design_pattern.strategy.implementation1;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting using Bubble sort");
    }
}
