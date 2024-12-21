package com.exception_handling.question_2;

public class CustomException extends Exception{
    CustomException(String message){
        super(message);
    }
}
class Main{
    public static void main(String[] args) {
     int a=10;
     Main obj=new Main();
     try{
         obj.ageValidate(a);
         System.out.println("Your age is "+a);
     }catch (CustomException e){
         System.out.println("something went wrong "+ e.getMessage());
     }
    }

    public void ageValidate(int age) throws CustomException{
        if(age<20){
            throw new  CustomException("Age must greater than 20");
        }
    }
}