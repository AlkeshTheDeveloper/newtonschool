package com.newton.starPattern;

public class star_pattern {
     static void downPattern(int rows){
      for (int i=0;i<rows;i++){
          for(int j=1;j<=rows-i;j++) {
              System.out.print( "\t"+j);

          }
          System.out.println();

          }

      }

    static void upPattern(int rows){
        for (int i=0;i<=rows;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("\t "+j);

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        downPattern(10);
        upPattern(10);
    }

}
