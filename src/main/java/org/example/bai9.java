package org.example;

import java.util.Scanner;

//Viết chương trình in ra bảng cửu chương từ 1 đến 10
public class bai9 {
    public static void main(String[] args) {
       for (int i = 1; i <= 10; i++) {
           System.out.println("Bang cuu chuong " + i + ":");
           for (int x = 1; x <= 10; x++) {
               System.out.printf(i + "x" + x + "=" + (i*x) + ",");
            }
           System.out.println();
        }
    }
}