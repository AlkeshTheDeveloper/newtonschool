package com.newton.collections1;
import java.util.*;
public class stack {


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // Adding elements in stack
        st.push(12);
        st.push(36);
        st.push(21);
        st.push(14);
        st.push(15);
        st.push(18);
        st.push(21);
        st.push(33);
        st.push(14);

        st.add(5);
        System.out.println(st);

        st.pop();//removing elements in stack;

        st.peek();// giving top value in stack
        System.out.println("peek is = " + st.peek());
        System.out.println("after changes " + st);
        while (!st.empty()) {
            st.pop();
            System.out.println(st);
        }

        while (st.size() < 5) {
            st.push(1);
            System.out.println("size is=" + st.size());
        }
        st.push(2);
        System.out.println(st.size());
        System.out.println("not empty and peek is " + st.peek());

//
//                Scanner sc = new Scanner(System.in);
//                int n = sc.nextInt();
//
//                Stack<Integer> st = new Stack<>();
//
//                for(int i = 0; i < n; i++){
//                    int x = sc.nextInt();
//                    System.out.println(st);
//                    while(!st.empty() && st.peek() >= x){
//                        st.pop();
//                    }
//                    if(st.empty()){
//                        System.out.print("this is value"+"-1 ");
//                    }
//                    else{
//                        System.out.println(st.peek()+" jj");
//                    }
//                    st.push(x);
//                }
    }
        }



