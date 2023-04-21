package com.csi.controller;

public class ArithmeticApplication {

    public static void main(String[] args) {


        System.out.println("Addition Result:"+addtion(20,60));
        System.out.println("Substaction Result:"+substraction(20,10));
        System.out.println("Multiplication Result:"+multiplication(10,60));
        System.out.println("Division Result:"+division(50,2));
    }

    public static int addtion(int n1, int n2){
        return n1+n2;
    }

    public static int substraction(int n1, int n2){
        return n1-n2;
    }

    public static int multiplication(int n1, int n2){
        return n1*n2;
    }

    public static int division(int n1, int n2){
        return n1/n2;
    }


}
