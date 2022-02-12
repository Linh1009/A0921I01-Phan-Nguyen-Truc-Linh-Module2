package case_study.controllers;

import case_study.services.impl.CustomerServiceImpl;
import case_study.services.impl.EmployeeSeviceImpl;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Managerment");
            System.out.println("3. Facility Managerment");
            System.out.println("4. Booking Managerment");
            System.out.println("5. Promotion Mângerment");
            System.out.println("7. Exit");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeSeviceImpl employeeSevice = new EmployeeSeviceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Back to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    employeeSevice.display();
                    break;
                }
                case 2: {
                    employeeSevice.addNew();
                    break;
                }
            }

        }
    }

    public static void displayCustomerMenu(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Back to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    customerService.display();
                    break;
                }
                case 2: {
                    customerService.addNew();
                    break;
                }
            }

        }
    }
}
