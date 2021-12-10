package introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cần đổi");
        double usd  = scanner.nextDouble();
        double vnd = usd  * 230000;
        System.out.println("Số tền sau chuyển đổi là: " +vnd);
    }
}
