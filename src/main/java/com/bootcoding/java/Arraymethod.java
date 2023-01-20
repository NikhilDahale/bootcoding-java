package com.bootcoding.java;

public class Arraymethod {
    public static void main(String[] args) {
        int a[]={10,23,33,40};
        Arraymethod(a);
    }

    public static void Arraymethod(int a[]){
        for(int i =0; i< a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }

    }
}
