package com.ijtaba.arraysRecursion;

public class SortedArrayOrNot {
    public static boolean sorted(int[] arr ){
        return helper(arr , 0);
    }
    public static boolean helper(int[] arr , int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && helper(arr, i+1);

    }
    public static void main(String[] args) {
        System.out.println(sorted(new int[] {1 ,2 ,3, 4, 5 ,7 }));
    }
}
