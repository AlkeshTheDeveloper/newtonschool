package com.newton.Pallindrome;

import java.util.Scanner;

public class ArrayPalindromes {


    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter number:");
        int n=sc.nextInt();
        int []a=new int[n];
        int flag=0;
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }



        for(int i=0;i<n;i++){
            if(a[i]!=a[n-1-i]) {
                flag=1;
                break;}
        }
        if(flag==1){
            System.out.print("not an pallindrome");

        }
        else
            System.out.print("pallindrome");
    }
}