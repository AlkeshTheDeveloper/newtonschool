package com.newton.BasicProgramming;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, a, temp;
        temp = n;
        while (n > 0) {//153
            a = n % 10;
            n = n / 10;
            sum = sum + (a * a * a);//27+125

        }
        if (temp == sum) {
            System.out.println("Armstrong number");
        } else
            System.out.println("Not an Armstrong number");
    }
}