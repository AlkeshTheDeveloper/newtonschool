package com.newton.arrayPackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayKth {
    static int findKthSmallest(int arr[],int k){
        Arrays.sort(arr);//2 3 6 7 8 11
        int count=0;
        for (int i=0;i<k;i++){
            if (arr[i]<arr[i+1]){
                count=arr[i];
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[]={7,11,6,2,3,15,8};
        Scanner sc=new Scanner(System.in);
//        int k=sc.nextInt();
//        int result=findKthSmallest(arr,k);
//        System.out.println(result);
        peakArrayElement gt=new peakArrayElement();
      int ans=  gt.PeakElement(arr);
        System.out.println(ans);
    }
}

class peakArrayElement{
 public static int PeakElement(int arr[]){
        // 7,11,6,2,3,8
     int count=0;
      for (int i=1;i<arr.length-1;i++) {
          if (arr[i - 1] <= arr[i] && arr[i] >= arr[i + 1]) {
              count= arr[i];
              break;
          }
      }
//          System.out.println("no peak found");
 return  count;
}}
