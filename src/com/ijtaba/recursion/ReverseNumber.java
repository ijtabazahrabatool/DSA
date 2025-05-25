package com.ijtaba.recursion;

public class ReverseNumber {
//    private int  reverse(int n , int sum){
//        if(n == 0){
//            return sum;
//        }
//        int rem = n%10;
//        sum = (sum*10) + rem;
//
//        return reverse(n/10 , sum);
//    }
//    public static void main(String[] args) {
//        ReverseNumber obj = new ReverseNumber();
//        System.out.println("ReversedNumber:" + obj.reverse(8914 , 0));
//
//    }


    //--------------------------------------------------Another way---------------------------------------------------------
    private void reverse(int n){
        int digit = (int) (Math.log10(n)+1);
        System.out.print(helper(n , digit));
    }

    private int helper(int n , int digit){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10 , digit - 1) + helper(n / 10 , digit - 1);
    }

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        obj. reverse(2003);
    }
}
