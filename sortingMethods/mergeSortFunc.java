package com.newton.sortingMethods;

import java.util.*;
// first we get array which is unsorted
// first we have to divide the array

public class mergeSortFunc {
static void printArray(int arr[]){
    int size=arr.length;
    System.out.print("array is:");
    for (int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
}
    static void merge(int arr[],int start,int mid,int end){
        int size1=mid-start+1;
        int size2=end-mid;

        int left[]=new int[size1];
        int right[]=new int[size2];

        for(int i=0;i<size1;i++){
            left[i]=arr[start+i];
        }

        for(int i=0;i<size2;i++){
            right[i]=arr[mid+1+i];
        }

        int i=0,j=0,k=start;

        while(i<size1 && j<size2){
            if (left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;}
            k++;
        }
        while(i<size1){
            arr[k]=left[i];
            i++;
            k++;
        }

        while(j<size2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    static void sort(int arr[],int start,int end){
        if (start<end){
            int mid=(start+end)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();

        System.out.println("Enter input of array");
        int arr[]=new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int start=0;
        int end=arr.length-1;
        sort(arr,start,end);

        printArray(arr);


    }
}