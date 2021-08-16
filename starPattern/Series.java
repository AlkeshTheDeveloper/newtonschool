package com.newton.starPattern;

import java.util.*;


public class Series {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter series size");
        int n=sc.nextInt();
        int count=n;
        if(n%2==0)
            count=count-1;

        int[] series=new int[count];
        int c=count;
        int j=1;
            while(c>0){
                if(j%2==1){
                    if(c==1)
                        System.out.print(j);
                    else
                        System.out.print(j+", ");
                    c--;
                }
                j++;
            }
    }

}
