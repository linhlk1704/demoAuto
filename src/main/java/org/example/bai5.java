package org.example;

import java.util.Scanner;

//Viết chương trình tính diện tích và chu vi hình chữ nhật
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay nhap chieu dai");
        float chieuDai = scanner.nextFloat();

        System.out.println("Hay nhap chieu rong");
        float chieuRong = scanner.nextFloat();

        float chuVi = (chieuDai + chieuRong) * 2;
        float dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi hinh chu nhat la " + chuVi);
        System.out.println("Dien tich hinh chu nhat la " + dienTich);

    }
}
