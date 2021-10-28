package com.newton.Pallindrome;



import java.util.*;

public class NumberPalindromes {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter number:");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;//101
        while (temp > 0) {
            int a = temp % 10;//1
            sum = (sum * 10) + a;
            temp = temp / 10;//10

        }
        if(n==sum){
            System.out.println("Number is Pallindrome");
        }
        else
            System.out.println("Number is not Pallindrome");

    }
}
