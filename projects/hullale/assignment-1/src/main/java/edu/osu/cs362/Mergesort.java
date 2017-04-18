/*
The algorithm for Mergesort was found here: http://www.vogella.com/tutorials/JavaAlgorithmsMergesort/article.html
I added the constructors, return for mergesort, and sort function.
 */

package edu.osu.cs362;
public class Mergesort {
    private int[] numbers;
    private int[] helper;

    private int number;

    public Mergesort(){
        number = 0;
    }

    public Mergesort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
    }

    public int getAt(int n){
        //FIXME ORIGINAL CODE
        //return numbers[n];
        //BUGGY CODE
        return helper[n];
    }

    public void sort(int[] values){
        mergesort(0, number -1 );
    }

    public void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        //FIXME ORIGINAL CODE
        //if (low < high)
        //BUGGY CODE
        if (low > high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        //FIXME ORIGINAL CODE
        //for (int i = low; i <= high; i++) {
        //BUGGY CODE
        for (int i = low; i <= high; i++) {
            helper[i+1] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }
}