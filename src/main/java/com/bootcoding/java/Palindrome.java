package com.bootcoding.java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n =sc.nextInt();
        int temp = n ;
        int rem =0;
while(n!=0){

rem = rem *10+n%10;
n=n/10;
    System.out.println("n:" + n + " | rem :" + rem);

}
if(temp==rem){
    System.out.println(temp + "Is palindrome number ");
}
else{ System.out.println(temp + "Is not palindromenumber");
}
}}