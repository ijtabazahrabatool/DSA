package com.ijtaba.arraysRecursion;

import java.util.ArrayList;
// just for understanding
// not optimized because creating new object with every function call
public class FindTargetUsingArrayList {
    static ArrayList<Integer> findTarget(int[] arr , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> belowFunctionCallsAns = findTarget(arr , target , index + 1);
        // adding to the current list of the current function
        list.addAll(belowFunctionCallsAns);
        return list;
    }
    public static void main(String[] args) {
        System.out.println(findTarget(new int[]{4,5,6,9,8,9}, 9, 0));
    }
}
