package com.newton.sortingMethods;

import java.util.Scanner;
/*
1. compare 1st element to 2nd element if 1st >2nd
    swap first with second
2. else  not then no change
 for decreasing order
   check first with second if first<second
3.timecomplexity :-0(n2)


*/

public class BubbleSortFunc {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();}
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++) {
//                if (a[j] > a[j + 1]) {
//                    temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
              // for decreasing order
               if(a[j]<a[j+1]){
                   temp=a[j+1];
                   a[j+1]=a[j];
                   a[j]=temp;
               }
            }

        }
        for (int i=0;i<n;i++)
        System.out.print(a[i]+" ");}
    }

