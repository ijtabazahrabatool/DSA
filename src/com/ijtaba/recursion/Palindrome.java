package com.ijtaba.recursion;



public class Palindrome {
      static boolean palindrome(String n , int start  , int end , int length){
        if(start >  end){
            return true;
        }
        if(n.charAt(start) == n.charAt(end)){
            return palindrome(n , start + 1, length-(start + 1)-1 , length);
        }
        else return false;
    }

    public static void main(String[] args) {
        String n = "12321";
        int length = n.length();
        System.out.println(palindrome(n, 0 , length - 1 , length));
    }
}
