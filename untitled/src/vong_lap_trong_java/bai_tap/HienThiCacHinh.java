package vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác vuông");
            System.out.println("3. Hình tam giác vuông ngược");
            System.out.println("4. Hình tam giác cân");
            System.out.println("Nhập số bạn cần in ra: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hình chữ nhật");
                    for(int i=0;i<3;i++) {
                        for(int j =0;j<7;i++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("Hình tam giác vuông");
                    for(int i=1; i<=5; i++){
                        for(int j=1; j<i; j++){
                            System.out.print("*");
                        }
                        System.out.println(" ");

                    }
                        break;
                case 3:
                    System.out.println("Hình tam giác vuông ngược");
                    for(int i=7;i>=1;i--){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                    }

                        break;
                case 4:
                    System.out.println("Hình tam giác cân");
                    for(int i = 1; i <= 7; i++) {
                        for(int j = 1; j <= 7-i; j++) {
                            System.out.print("  ");
                        }
                        for(int k = 1; k <= 2*i-1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                        break;
                default:
                    System.out.println("No choice!");
            }
        }
    }

}
