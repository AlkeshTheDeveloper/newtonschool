package com.newton.arrayPackage;
import  java.util.*;
import java.lang.reflect.Array;

public class duplicateCount {

    static void FindDuplicate(int arr[]) {
        String a="nuts";

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.print("Duplicate found "+arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1, 5, 6 ,5 ,6,3};
        System.out.println(Arrays.toString(arr));
        FindDuplicate(arr);
    }
}