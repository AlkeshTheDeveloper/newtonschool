package com.newton.stringpack;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String S = Sc.next();
        String k = Sc.next();
        char[] ch = S.toCharArray();
        char[] kch = k.toCharArray();
        if (ch.length == kch.length) {
            if (ch.equals(kch) ){
                System.out.println(ch);
            }
            }
        }
    }