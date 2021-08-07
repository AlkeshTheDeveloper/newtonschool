package com.newton.Arena;

import java.util.Scanner;

public class pattern {
    public static void pattern_making(int n){
      /*  for(int i=1;i<=n;i++){
            for(int j=i;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=n-i;j>=i;j--){

                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){

                System.out.print(j+" ");
            }
            for(int j=n-i;j>=1;j++){

                System.out.print(j+" ");
            }

            System.out.println();
        }*/
        for (int i=1;i<n;i++){
            for (int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }

        for (int i=1;i>1;i++){
            for (int j=1;j<n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        pattern_making( n);
    }
}
