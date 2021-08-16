package com.newton.time_complexity;

public class LoopTimeComplexity {
 static void orderOfTime(){
     int n=10;

     for (int i=0;i<n;i++){
         for (int j=i;j<=i;j++){
             System.out.println("i="+i+"j="+j+"innerloop");
             counter++;
         }
     }
 }



//        static int counter=0;
//        static void timeComplexityLoop(){
//            int num=10;
//
//           for (int i=0;i<num;i++){
//                for (int j=1;j<num;j*=3){
//                    System.out.println("dev"+"\tj="+j);
//                    counter++;
//                }
//            }
//     }


//void timeComplexityLoopOne(){
//    int num=10;
//
//    for (int i=0;i<num;i++){
//
//        for (int j=0;j<num;j++){
//            System.out.println("hello"+" "+ j);
//            counter++;
//        }
//    }
//}



    public static void main(String[] args) {
            // write your code here
          //  timeComplexityLoop();
          //  LoopTimeComplexity ltc=new LoopTimeComplexity();
        //  ltc.timeComplexityLoopOne();
        //orderOfTime();
      LoopTimeComplexity abc= new LoopTimeComplexity() ;
      abc.abc();
        System.out.println("counter="+counter);
        }
    static int counter=0;
   int abc(){
       return 0/1;
   }

}