package com.company;

public class class33_varargs {
/*
    static  int sum(int a, int b){
        return a+b;
    }
    static  int sum(int a, int b, int c){
        return a+b+c;
    }
    static  int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
*/
static int sum (int ...arr){
        // Available as int [] arr;
        int result = 0;
        for (int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs");
        System.out.println(" Sum of nothing is : "+sum());
        System.out.println("The sum of 4 & 5 is : "+sum(4,5));
        System.out.println("The sum of 4, 5 & 6 is : "+sum(4,5,6));
        System.out.println("The sum of 4, 5, 6, 10 is : "+sum(4,5,6,10));
        System.out.println("The sum of 4, 5, 9, 44 & 200 is : "+sum(4,5,9,44,200));
    }
}
