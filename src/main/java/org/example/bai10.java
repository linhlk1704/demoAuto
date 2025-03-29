package org.example;

import java.util.Scanner;

/*Một tuần, người lao động phải làm việc 40 giờ theo giờ quy định của công ty.
Trường hợp người lao động làm hơn 40 giờ, thì số giờ làm thêm sẽ được tính với hệ số 1.5.
Hãy viết chương trình nhập vào số giờ làm và lương mỗi giờ của nhân viên,
sau đó tính tổng lương mà nhân viên đó được nhận.*/
public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay nhap luong mot gio lam cua nhan vien A");
        float oneHourPaid = scanner.nextFloat();

        System.out.println("Hay nhap vao so gio lam cua nhan vien A");
        float workingTime = scanner.nextFloat();
        float otTime = workingTime - 40;
        float otPaid = (float) (otTime * oneHourPaid * 1.5);

        if (workingTime <= 40) {
            System.out.println("Luong mot gio lam cua nhan vien A la " + oneHourPaid);
            System.out.println("Tong luong cua nhan vien A la " + workingTime * oneHourPaid);
        } else {
            System.out.println("Luong mot gio lam cua nhan vien A la " + oneHourPaid);
            System.out.println("So gio lam them cua nhan vien A la " + otTime);
            System.out.println("Luong OT cua nhan vien A la " + otPaid);
            System.out.println("Tong luong cua nhan vien A la " + (40 * oneHourPaid + otPaid));
        }
    }
}
