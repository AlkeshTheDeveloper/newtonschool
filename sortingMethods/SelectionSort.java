package com.newton.sortingMethods;

public class SelectionSort {
    public static void selectionSort(int arr[],int n){//85 23 14 4 2
        for (int i=0;i<n-1;i++){
           int minimum=i;
            for (int j=i+1;j<n;j++)
                if (arr[j]<arr[minimum])//23<85
                    minimum=j;//min=1}

             int temp=arr[minimum];
             arr[minimum]=arr[i];
             arr[i]=temp;


    }
    }
//        for (int i = 0; i < n-1; i++)
//        {
//            // Find the minimum element in unsorted array
//            int min_idx = i;
//            for (int j = i+1; j < n; j++)
//                if (arr[j] < arr[min_idx])
//                    min_idx = j;
//
//            // Swap the found minimum element with the first
//            // element
//            int temp = arr[min_idx];
//            arr[min_idx] = arr[i];
//            arr[i] = temp;
//        }
//    }
    public static void main(String[] args) {
//     int arr[]={45,25,96,1,2};
        int arr[]={96,45,25,2,1};

        int n= arr.length;
     selectionSort(arr,n);
//     for(int i=n-1;i>-1;i--){
//         System.out.print(arr[i]+" ");
//     }
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
