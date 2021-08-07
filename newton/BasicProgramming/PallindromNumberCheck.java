package com.newton.BasicProgramming;

import java.util.Scanner;

public class PallindromNumberCheck {
    static void palindromeCheck(long n) {
        String s = "";
        String numberToCheck = "" + n;
        int strlen=numberToCheck.length();
        int i=0;int count=0;
        while (i<strlen/2){
          if (numberToCheck.charAt(i)==numberToCheck.charAt(strlen-1-i)){
              count++;

          }
          i++;
        }
        if (count>=strlen/2){
//            System.out.println("count="+count+"strlen/2="+strlen/2);
            System.out.println("NUMBER IS PALLINDROME");
        }
        else
            System.out.println("NUMBER IS not PALLINDROME");
            }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        palindromeCheck(n);
    }
}
