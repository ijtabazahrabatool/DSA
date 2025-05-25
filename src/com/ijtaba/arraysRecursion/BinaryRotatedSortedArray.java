package com.ijtaba.arraysRecursion;

public class BinaryRotatedSortedArray {
     public static int  binarySearch(int[] arr ,int s , int e ,int key){
         // base condition
         if( s > e) return -1;

        int mid = s + ( e - s ) / 2;
        if(arr[mid] == key){
            return mid;
        }

        if(arr[s] <= arr[mid]){
            if(key < arr[mid] && key >= arr[s]){
                return binarySearch(arr, s , mid - 1, key );
            }
            else{
                return binarySearch(arr , mid + 1, e , key);
            }
        }
        else{
            if(key > arr[mid] && key <=arr[e]){
                return binarySearch(arr, mid + 1 , e , key );
            }
            else{
                return binarySearch(arr, s , mid - 1 , key );
            }
        }

    }

    public static void main(String[] args) {
         int[] arr = new int[]{5, 6, 7, 8, 9, 1, 2, 3, 4};
        System.out.println(binarySearch(arr, 0 , arr.length-1 , 2));
    }
}
