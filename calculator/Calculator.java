package com.newton.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value 0f a ");
        double a=sc.nextDouble();
        System.out.println("enter value 0f b");

        double b=sc.nextDouble();
        System.out.println("enter operation");

        String typeOfOperation=sc.next();

        String k= typeOfOperation.toUpperCase();
         double result;
        switch (k){
            case "ADDITION":
                result=a+b;
                System.out.printf("%f",result);
                break;
            case "SUBTRACTION":
                result=a-b;
                System.out.printf("%f",result);
                break;
            case "MULTIPLICATION":
                result=a*b;
                System.out.printf("%f",result);
                break;
            case "DIVISION":

                if (a==0 && b==0){
                    System.out.println("result is undefined");
                }
                else{
                result=a/b;
                System.out.printf("%f",result);}
                break;
            default:
                System.out.println("invalid operation");

        }

    }

}
