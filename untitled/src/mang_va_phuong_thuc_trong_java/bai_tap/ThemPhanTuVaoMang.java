package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước mảng không vượt quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length - 1) {
            System.out.print("Nhập phần tử" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Nhập giá trị của x:");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = scanner.nextInt();
        if (index <= 1 & index >= array.length - 1) {
            System.out.println("không thể chèn phần tử vào mảng");
        }
        for (int j = 0; j < array.length; j++) {
            if (index == j) {
                array[j] = x;
                array[j+1] = array[j];
            }
        }
        System.out.println("Mang sau khi chèn la: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
