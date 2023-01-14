package com.bootcoding.java;

import java.util.Scanner;

public class IntegerNo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the  first number ");
    int i = sc.nextInt();

    System.out.println("Enter the  second number ");
    int j = sc.nextInt();

    System.out.println("Enter the third number ");
    int k = sc.nextInt();

    if(i>=j && i>=k){
      System.out.println(i +" is a maximum number");
    }
    else if (j>=i && j>=k) {
      System.out.println(j + "  is a maximum number");
    }
    else{
      System.out.println(k +"  is a maximum number");
    }

  }}
