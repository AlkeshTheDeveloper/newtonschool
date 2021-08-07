package com.newton.Arena;
import java.util.*;

public class helpSara {

        public static void main (String[] args) {
            // Your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int temp;
            for (int i=0;i<n;i++) {
                int k=sc.nextInt();
                int count=0;

                while(k>0){
                    temp=k;//25 18
                    int  sum=0;//5 8
                    int  first=0;//2 1
                    int j=k;
                    while (j>0){//25
                        sum+=j%10;//5
                        j=j/10;//2
                    }

                    int result=sum+first;//7 9
                    k=k-result;//25-7 18-9
                    count++;
                }

                System.out.println(count);
            }
        }
    }

class countpairs{

    // don't change the name of this class
// you can add inner classes if needed

        static int count=0;

        public static void main (String[] args) {
            // Your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int sum=sc.nextInt();
            int a[]=new int[n];
            for(int i=1;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            for(int i=0;i<n-1;i++){

                for(int j=1;j<n;j++){
                    if (a[i]+a[j]==sum){
                        count++;
                    }
                }
            }
            System.out.print(count);
        }
    }
