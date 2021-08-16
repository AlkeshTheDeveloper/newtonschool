package com.newton.trignometry_series;
import java.util.*;

public class trignometry {
//  AREA OF RECTANGLE
  static  void  AreaOfRect(int l,int b){
      int area=l*b;
      System.out.println("area of rectangle ="+" "+area);
  }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
       int l=sc.nextInt();
       int b=sc.nextInt();
       int r= sc.nextInt();
        AreaOfRect(l,b);
        AreaOfCircle(r);
        perimeterOfRect(l,b);

    }

// AREA OF CIRCLE
static  void AreaOfCircle(int r){
      double area=3.14*Math.pow(r,2);
      System.out.println("area of circle ="+" "+area);
  }

// PERIMETER OF RECTANGLE
     static void perimeterOfRect(int l,int b){
        double p=2*(l+b);
        System.out.println("perimeter of rectangle ="+" "+p);
    }


}

class numberSeries{
    public static  int  fabonacciSeries(int a){
        if (a==0)
            return 0;
       else if (a==1)
            return 1;
       else
        return fabonacciSeries(a-1)+fabonacciSeries(a-2);

    }

}

class arrayPrinting {



}
