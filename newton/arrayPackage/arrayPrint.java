package com.newton.arrayPackage;

import java.util.Scanner;

public class arrayPrint {
    // arr={1,3,7,9,5}
//    public static void arrayPrint(int[] arr){
//
//        int index=0;// index out of bound?
//        for(int i:arr){
//
//            index++;
//            System.out.print(arr[index-1]+" ");
//        }





    public static void printArray(int[] arr) {
        int count = 0;

        for (int i : arr) {
            System.out.println("arr[" + count + "]" + "=" + i);
            count++;
        }

    }



    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter input size:");
        int n=sc.nextInt();
        System.out.println("enter array elements:");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
//            System.out.print("array="+" "+arr[i]+" ");
        }
       printArray(arr);
    }

}

