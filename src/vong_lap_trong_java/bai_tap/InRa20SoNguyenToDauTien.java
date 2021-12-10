package vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class InRa20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra");
        int numbers = scanner.nextInt();
        int status = 1;
        int num = 3;
        if(numbers>1) {
            System.out.println(numbers + " số nguyên tố đầu tiên là");
            System.out.println("2");
        }
            for(int i=2 ;i< numbers;){
                for(int j = 2 ; j <= Math.sqrt(num) ; j++){
                    if(num % j == 0){
                        status = 0;
                        break;
                    }
                }
                if(status != 0){
                    System.out.println(num);
                    i++;
                }
                status = 1;
                num++;
            }
    }
}
