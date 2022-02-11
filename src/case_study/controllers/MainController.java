package case_study.controllers;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Add New Services");
            System.out.println("2. Show Services");
            System.out.println("3. Add New Customer");
            System.out.println("4. Show Information of Customer");
            System.out.println("5. Add New Booking");
            System.out.println("6. Show Information of Employee");
            System.out.println("7. Exit");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    addNewServices();
                    break;

            }
        }
    }
    public static void addNewServices(){
        boolean check = true;
        while (check){
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number){
                case 1:
            }

        }
    }


    public static void showServices(){
        boolean check = true;
        while (check){
            System.out.println("1. Show all Villa");
            System.out.println("2. Show all House");
            System.out.println("3. Show all Room");
            System.out.println("4. Show All Name Villa Not Duplicate");
            System.out.println("5. Show All Name House Not Duplicate");
            System.out.println("6. Show All Name Name Not Duplicate");
            System.out.println("7. Back to menu");
            System.out.println("8. Exit");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number){
                case 1:
            }
        }
    }

}
