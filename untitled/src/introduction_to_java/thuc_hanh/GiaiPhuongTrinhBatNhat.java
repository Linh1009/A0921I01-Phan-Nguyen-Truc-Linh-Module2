package introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBatNhat {
    public static void main(String[] args) {
        System.out.println("Giải phương trinh bật nhất");
        System.out.println("Nhập các số a, b, c");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("x =" + answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
