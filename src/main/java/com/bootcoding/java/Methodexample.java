package com.bootcoding.java;

public class Methodexample {
    public static void main ( String [] args ) {
        calculateArmstrong();
    }
    public static void calculateArmstrong(){
        int n = 1634 ;
        int temp = n;
        int rem =0 ;
        int sum =0 ;
        while(temp!=0){
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;


        }
        if(n==sum){
            System.out.println( n+"is armstrong number!");
        }
        else{
            System.out.println( n+"is not armstrong number !");
        }
    }
}



