package com.ijtaba.arraysRecursion;

public class FindTarget {
    public int find(int[] arr , int target , int index){
        if(index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return find(arr, target, index+1);
    }
    public static void main(String[] args) {
        FindTarget findTarget = new FindTarget();
        System.out.println(findTarget.find(new int[]{1,2,3,4,9,6,7,8}, 9, 0));
    }
}
