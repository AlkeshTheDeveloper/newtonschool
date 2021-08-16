package com.newton.Bitmanipulation;
import java.util.*;
public class bitCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 7
        // we have to check number of set bits and count it
        long n=sc.nextInt();// 7 =>111 6=>110
        long count=0;
        while (n>0){
            long r=n%2l;    //6=>0
            count+=r;       //0 1 2
            n/=2l;// 3 1 0


        }
        System.out.println(count);
    }
}
