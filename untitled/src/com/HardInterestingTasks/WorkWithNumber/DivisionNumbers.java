package com.HardInterestingTasks.WorkWithNumber;

public class DivisionNumbers {
    public static void main(String[] args) {


        int value = 123456789;                   //  123456789      100000000   439 / 10 = 43
        int temp;
        int backWard = 0;                        //  9 87654321
        while (value != 0) {                     // value =  0 1 2 3 45 7 8 9
            temp = value % 10;                   // 9 8
            value = value / 10;                  // division number

            backWard = (backWard * 10) + temp;   // 90 + 8 glue numbers

            System.out.println(temp + " ");
            System.out.println(value);
            System.out.println(backWard);
            System.out.println("--------------------");
        }





        //                                  456789

//        int val3 =  val % 10;          // 9
//        int val2 =  val / 10 % 10;     // 45678
//        int val1 =  val / 100 % 10;    // 4567
//
//        int val0 =  val / 1000 % 10;   // 456
//
//        int val01 = val / 10000 % 10;  // 45
//        int val02 = val / 100000 % 10; // 4
//        int val03 = val / 1000000;     // 0


//        int value = 123456789;
//        int temp;
//        int division = 1;
//        while (value / division != 0) {
//            temp = (value / division) % 10;
//            division = division * 10;
//
//            System.out.print(temp + " ");

            //    переворачиваем

//            int division = 100000000;
//            while (value / division != 0) {
//                temp = (value / division) % 10;
//                division = division / 10;
 //       }
    }
}
