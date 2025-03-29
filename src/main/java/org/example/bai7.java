package org.example;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

/*Viết chương trình yêu cầu người dùng nhập một số nguyên,
sau đó kiểm tra xem số đã nhập là số chẵn hay số lẻ */
public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay nhap mot so nguyen bat ki ");
        long a = scanner.nextLong();
        if (a % 2 == 0) {
            System.out.println(a + " la so chan");
        } else {
            System.out.println(a + " la so le");
        }
    }
}
