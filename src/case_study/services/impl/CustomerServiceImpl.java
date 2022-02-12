package case_study.services.impl;

import case_study.models.Customer;
import case_study.services.CustomerServices;
import case_study.util.ReadAndWriteToCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerServices {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private final String CUSTOMER_PAHT_FILE ="src\\data\\Customer.csv";


    @Override
    public void display() {
        for(Customer customer: customerList
        ){
            System.out.println(customer.toString());
        }
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
        System.out.println("Nhập loại khách: ");
        String typeCustomer = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Customer costomer = new Customer (id, name, age, sex,idCard, email, typeCustomer,address);
        customerList.add(costomer);
        ReadAndWriteToCSV.writeCustomerListToCSV1(CUSTOMER_PAHT_FILE,customerList,true);

    }

    @Override
    public void edit() {

    }

    @Override
    public void detele() {
        List<Customer> customerList = ReadAndWriteToCSV.readCustomerListFormCSV(CUSTOMER_PAHT_FILE);
        display();
        System.out.println("Chọn customer cần xóa");
        int chooseDelete = Integer.parseInt(scanner.nextLine());
        customerList.remove(chooseDelete-1);
        ReadAndWriteToCSV.writeCustomerListToCSV(CUSTOMER_PAHT_FILE,customerList,false);
    }
}
