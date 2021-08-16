package com.newton.Pallindrome;
import java.util.*;

public class StringPallindrome {
    public static void main(String[] args) {


                Scanner sc=new Scanner(System.in);
                System.out.print("Enter string:");
                String n=sc.nextLine();

                int flag=0;




                for(int i=0;i<(n.length()/2);i++){
                    if(n.charAt(i)!=n.charAt(n.length()-1-i)) {
                        flag=1;
                        break;}
                }
                if(flag==1){
                    System.out.print("not an pallindrome");

                }
                else
                    System.out.print("pallindrome");
            }
        }

