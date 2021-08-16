package com.newton.Gcd;

import java.util.Scanner;

public class MathsGcd {
    static int gcd(int a, int b)//98 56//42 56
    {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;//14

        // a is greater
        if (a > b)//98>56
            return gcd(a-b, b);//42,56 //28 14// 14 14
        return gcd(a, b-a);//42 14
    }

    // Driver method
    public static void main(String[] args)
    {
        int a = 98, b = 56;
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}



 class HelloWorld{
    static void bubbleSort(int a[],int n){
        int temp;
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }  }



    }


    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        bubbleSort(a,n);


        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]+" ");
        }

    }
}