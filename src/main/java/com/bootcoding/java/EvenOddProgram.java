package com.bootcoding.java;

import java.util.Scanner;

public class EvenOddProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world");
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        int a=10;
        n=a+2+ ++a;
    //    n=a+2+ a++;
        if(n%2==0){
            System.out.println(n +"is Even number");
        } else{
            System.out.println(n+"is Odd number");
        }
    }
}

//write a prog to take 3 integer no from user and print maximum no among them
