package com.newton.arrayPackage;

import java.util.Scanner;

public class armstrongnumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k, count = 0, a, b, c, sum = 0;
        for(int i = 1; i <= n; i++)
        {
            k = i;
            while(k > 0)
            {
                b = k % 10;
                sum = sum + (b * b * b);
                k = k / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }

}