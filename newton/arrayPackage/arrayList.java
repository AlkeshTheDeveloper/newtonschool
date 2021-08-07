package com.newton.arrayPackage;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(19);
        arr.add(5);

        arr.get(0);

        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        arr.set(2,3);
         arr.set(2,18);

        Collections.sort(arr);
        System.out.println(arr+" ");
        arr.add(8);
        arr.remove(Integer.max(0,1));
        System.out.println(arr+" ");

        System.out.println(arr.size()+" ");

        ArrayList<String> ars=new ArrayList<>();

        ars.add("work hard");
        System.out.println(ars);
        ars.remove(1);
        ars.add(1,"learn well");
        System.out.println(ars);
    }
}
