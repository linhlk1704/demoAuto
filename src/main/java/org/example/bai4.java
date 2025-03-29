package org.example;

import java.util.Scanner;

//Viết chương trình cho phép người dùng nhập vào
//thông tin Họ và tên, Ngày tháng năm sinh, sau đó in ra màn hình
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap ho va ten");
        String fullName = scanner.nextLine();

        System.out.println("Hay nhap ngay thang nam sinh (dd/MM/yyyy");
        String myBirthday = scanner.nextLine();

        System.out.println("my name is " + fullName);
        System.out.println("my birthday is " + myBirthday);

    }
}
