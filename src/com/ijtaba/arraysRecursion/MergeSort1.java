package com.ijtaba.arraysRecursion;
import java.util.Arrays;

public class MergeSort1 {
    int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        // copyOfRange method is exclusive! and this method always create the copy of the orginal array, hence each time new array object is created
        int[] left = mergeSort(Arrays.copyOfRange(arr , 0 , mid) );
        int[] right = mergeSort(Arrays.copyOfRange(arr , mid , arr.length));

        return merge(left , right);
    }

    int[] merge(int[] first , int[] second){
        int i = 0;
        int j = 0;
        int k = 0;

        int[] newSortedArray = new int[first.length + second.length];

        while(i < first.length && j < second.length){
            if(first[i] <= second[j]){
                newSortedArray[k] = first[i];
                i++;
            }
            else{
                newSortedArray[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            newSortedArray[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            newSortedArray[k] = second[j];
            j++;
            k++;
        }
        return newSortedArray;
    }

    public static void main(String[] args) {
        MergeSort1 ms = new MergeSort1();
        int[] arr = {4 , 2, 4, 7, 9, 7, 8, 3, 56,23};
        // returns a string and Original Array not modified hence copy of the array (using copyOfRange()) modified and returned;
        System.out.println(Arrays.toString(ms.mergeSort(arr)));
    }
}
