package com.bootcoding.java;

public class Valuebetween {
    public static void main(String[] args) {
        int n[] = {10, 15, 20, 25, 35, 75, 80, 95};

        for (int i = 0; i < n.length; i++) {
            if(n[i]>30 && n[i]<=100){
                System.out.println(n[i]);
            }

        }
    }
}