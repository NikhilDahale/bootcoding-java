package com.bootcoding.java;

public class array {
    //int a[]={10,20,30,40,50};//intialization and declaration

    //int a[] = new int [4]; // declaration
    //a[0]=10;
    //a[1]=20;
    public static void main(String[] args) {
        int a[]={11,22,33,40,50};
        for (int i=0;i<a.length;i++){
            if(a[i] % 2 ==0){
                System.out.println(a[i]);

            }

        }

    }

}
