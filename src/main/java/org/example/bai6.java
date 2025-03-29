package org.example;

import java.util.Scanner;

/*Công thức chuyển đổi nhiệt độ C (Celsius) sang nhiệt độ F (Fahrenheit) như sau:
F=C∗ 9/5
Hãy viết chương trình cho phép người dùng nhập
 nhiệt độ C (Celsius) sau đó chuyển đổi sang nhiệt độ F (Fahrenheit)*/
public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay nhap nhiet do Celsius hien tai");
        float doC = scanner.nextFloat();
        float doF = (doC * 9 / 5);

        System.out.println("Nhiet do Fahrenheit hien tai la " + doF);

    }
}
