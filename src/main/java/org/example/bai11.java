package org.example;

import java.util.Scanner;

import static com.google.common.primitives.Longs.max;

//Viết chương trình nhập vào 1 mảng số nguyên, sau dó tìm phần tử lớn nhất trong mảng đó
public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap vao so nguyen A");
        long a = scanner.nextLong();
        System.out.println("Hay nhap vao so nguyen B");
        long b = scanner.nextLong();
        System.out.println("Hay nhap vao so nguyen C");
        long c = scanner.nextLong();

        long[] mangSoNguyen = {a, b, c};
        System.out.println("So nguyen lon nhat la " + max(mangSoNguyen));
    }
}