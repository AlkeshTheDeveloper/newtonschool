package com.newton.arrayPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class StringArray {
  static  String reverseString(String str){
      int n=str.length();
      String result="";
      int i=0;
      while (i<n){
          while (i<n && str.charAt(i)==' ')
              i++;
           if (i>=n)
               break;
           int j=i+1;
           while (j<n && str.charAt(j)!=' ')
               j++;
           String sub=str.substring(i,j-i);
           if (result.length()==0)
               result=sub;
           else result=sub+" "+result;
           i=j+1;
          }
       return result;
      }



    public static void main(String[] args) {
        String str="This is new world";
//     String k=reverseString(str);
//        System.out.println(k);
//        Scanner in=new Scanner(System.in);
//        System.out.println("enter a string");
//        String str=in.nextLine();
//        Stack<Character> st = new Stack<>();
//        for (int i=0;i<str.length();i++){
//            st.push(str.charAt(i));
//        }
//        System.out.println("reverse of string");
//        while (!st.empty()){
//            System.out.print(st.pop());
//        }

//        StringReversal string=new StringReversal();
//        string.ReverseStringUsingArray(str);
//        System.out.println();
//        string.ReverseStringUsingCharAt(str);
//        System.out.println();
//
//        string.ReverseStringUsingStack(str);
//        System.out.println();
//        ReverseStringWord nstring=new ReverseStringWord();
//        nstring.ReverseStringWord(str);

//        System.out.println(str[0]);
        char [] ch=str.toCharArray();
//     for (char c:ch){
//         System.out.print(c+" ");
//    }
//        System.out.println();
//     for(int i=0;i< ch.length;i++){
//        System.out.print(ch[ch.length-1-i]);}
      String array[]=str.split(" ");
     for(String a:array) {
//         System.out.println(a);
         char arr[]=a.toCharArray();
         for (int i=0;i<arr.length;i++){
             System.out.print(arr[arr.length-1-i]);
         }
         System.out.print(" ");
     }
 char a='z';
        System.out.println((int)a);
}

class StringReversal{
 // using Array for string reversal
   static void ReverseStringUsingArray(String s) {
//       Scanner in=new Scanner(System.in);
//       System.out.println("enter a string");
//       String s=in.nextLine();
       char [] ch=s.toCharArray();
       System.out.print("Reverse of string by Array: "+"\n");
       int j= ch.length;
       for (int i=j;i>0;i--){
           System.out.print(ch[i-1]);
       }
    }

    // using char at method
    void ReverseStringUsingCharAt(String S){
       int m=S.length();
        System.out.print("reverse using char at: "+"\n");
       for (int i=0;i<m;i++){
           System.out.print(S.charAt(m-1-i));
       }
    }

    //using stack
    void ReverseStringUsingStack(String s){
       Stack<Character> stack=new Stack<>();
        System.out.print("reverse using stack: "+"\n");

        for (int i=0;i<s.length();i++){
           stack.push(s.charAt(i));
       }
       while(!stack.empty()){
          char k=stack.pop();
           System.out.print(k);
       }
    }

}

class  ReverseStringWord {
    static void ReverseStringWord(String s) {
        //This is new world
        int len = s.length();
        String word = "";
        char ch[] = s.toCharArray();
        System.out.print("reverse word using stack with char: " + "\n");

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (ch[i] != ' ') {
                word = word + ch[i];
            } else {
                for (int c = word.length(); c > 0; c--) {
                    System.out.print(word.charAt(c - 1));

                }
                System.out.print(" ");
                word = "";
            }
        }
        for (int c = word.length(); c > 0; c--) {
            System.out.print(word.charAt(c - 1));
        }
    }


}}


/*
import java.util.Scanner;
import java.util.Stack;
public class HelloWorld{

     public static void main(String []args){
      Scanner InputTaker=new Scanner(System.in);
       String str=InputTaker.nextLine();
       System.out.println("Enter input string:   "+str);
    //   ReverseString(str);
    //     System.out.println();
    //   ReverseStringUsingStack(str);
    //   System.out.println();

    //   ReverseStringUsingCharAt(str);
    //           System.out.println();


       ReverseStringwordUsingCharArray(str);
     }

    static void ReverseString(String str){
        int len=str.length();

        for (int i=0;i<len;i++){
            System.out.print(str.charAt(len-1-i));
        }
     }

     static void ReverseStringUsingStack(String str){
       Stack <Character> stack=new Stack<>();
       char [] ch=str.toCharArray();

       for (int i=0;i<str.length();i++){
           stack.push(ch[i]);
       }

       while(!stack.empty()){
           System.out.print(stack.pop());
       }
     }

      static void ReverseStringUsingCharAt(String str){
       int len=str.length();
       while(len>0){
           System.out.print(str.charAt(len-1));
           len--;
       }
     }

   static void ReverseStringwordUsingCharArray(String str){
              String word="";
              char[] ch=str.toCharArray();
	for(int i=0;i<(ch.length);i++)
	{
		if(ch[i]!=' ')
		{
		word=word+ch[i];
		}
		else
		{
		  for(int c=word.length();c>0;c--)
		  {
		   System.out.print(word.charAt(c-1));
		  }
		  System.out.print(" ");
		  word="";
		}
	}
	for(int c=word.length();c>0;c--)
	{
		   System.out.print(word.charAt(c-1));
	}
	}



}
*/
