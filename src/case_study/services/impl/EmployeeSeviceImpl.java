package case_study.services.impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.services.EmployeeSevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSeviceImpl implements EmployeeSevice {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {

    }

    @Override
    public void addNew() {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.println("Nhap chứng minh: ");
        String idCard = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập chức vụ: ");
        String level = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        String position = scanner.nextLine();
        System.out.println("Nhap id: ");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee( id, name, age, sex, idCard, email, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void detele() {

    }
}
