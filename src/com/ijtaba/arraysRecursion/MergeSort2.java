package com.ijtaba.arraysRecursion;


public class MergeSort2 {
    static void mergeSort(int[] arr , int s ,int e){
        if(s > e){
            return;
        }

        int mid = s + e / 2;

         mergeSort(arr , s , mid);
         mergeSort(arr , mid + 1 , arr.length - 1);
         merge(arr , s , mid , e );
    }

        static void merge(int[] arr , int low , int mid , int high){
        int i = low;
        int j = mid + 1;
        int k = 0;

        //used Primitive Array instead of ArrayList , because it's faster and efficient for fixed size arrays.
        int[] temp = new int[high + 1];

        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= high){
            temp[k] = arr[i];
            j++;
            k++;
        }
        for(int x : temp){
            arr[low++] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4 , 2, 4, 7, 9, 7, 8, 3, 56,23};
        mergeSort(arr , 0 , arr.length - 1);
    }
}
