package com.exception_handling.question_1;

import java.util.Scanner;

public class ZeroScenario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float num1,num2,result;
        System.out.println("Enter first value:");
        num1=sc.nextFloat();
        System.out.println("Enter second value:");
        num2=sc.nextFloat();

        try{
            result=num1/num2;
        System.out.println("Division is :"+result);
        }catch (ArithmeticException e){
            System.out.println("Exception is occured"+e.getMessage());
        }

    }
}
