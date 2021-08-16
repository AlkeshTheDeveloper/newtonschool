package com.newton.starPattern;


import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=0;
        for (int i = 0; i <= n * 2; i++) {
            int k = n * 2 - i;
            if (i <= n) {
                if (i % 2 != 0) {
                    for (int j = 1; j <=i; j++) {
                        System.out.print(j);
                        if(j>=1 && j<i)
                            System.out.print(",");
                    }


            } else if (i % 2 == 0) {
                    for (int j = i; j > 0; j--) {
                        System.out.print(j);
                        if(j<=i &&j>1)
                            System.out.print(",");
                    }
                }
            } else if (i > n) {
                if (k % 2 != 0) {
                    for (int j = 1; j <= k; j++) {
                        System.out.print(j);
                        if(j>=1 && j<k)
                            System.out.print(",");
                    }
                } else if (k % 2 == 0) {
                        for (int j = k; j > 0; j--) {
                            System.out.print(j);
                            if(j<=k &&j>1)
                                System.out.print(",");
                        }
                    }
                }

                System.out.println();
            }
        }
    }