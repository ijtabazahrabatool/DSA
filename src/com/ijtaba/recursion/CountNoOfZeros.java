package com.ijtaba.recursion;

import java.util.Scanner;

public class CountNoOfZeros {
    static int count(int n ){
        return helper(n , 0);
    }
    // special function , return same value to above function calls
    static int helper(int n , int count){
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            return helper(n/10 , count + 1);
        }
            return helper(n/10 , count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit: ");
        int n = sc.nextInt();
        System.out.println(count(n));
    }

}

