package vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double laiXuat = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền đầu tư: ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = input.nextInt();
        System.out.println("Nhập lãi xuất hàng năm theo tỉ lệ phần trăm: ");
        laiXuat = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (laiXuat/100)/12 * month;
        }
        System.out.println("Tổng số tiền lãi: " + totalInterest);
    }

}
