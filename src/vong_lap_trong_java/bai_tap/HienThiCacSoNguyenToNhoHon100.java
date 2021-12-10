package vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int status = 1;
        int num = 3;
        int cout =0;
        System.out.println("100 số nguyên tố đầu tiên là: ");
        System.out.println("2");
        for(int i = 2 ; i <=100 ;){
            for(int j = 2 ; j <= Math.sqrt(num) ; j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }

            }
            if(status != 0){
                System.out.println(num);
                i++;
                cout++;
            }
            status = 1;
            num++;
        }

    }

}
