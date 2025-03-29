package org.example;

import java.util.Scanner;

//Viết chương trình yêu cầu người dùng nhập vào 1 số N, sau đó tính tổng các số từ 1 đến N
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap vao so nguyen N bat ki");
        long N = scanner.nextLong();
        long sum = 0;
        for (long i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("tong cac so tu 1 den N la " + sum);

    }
}
