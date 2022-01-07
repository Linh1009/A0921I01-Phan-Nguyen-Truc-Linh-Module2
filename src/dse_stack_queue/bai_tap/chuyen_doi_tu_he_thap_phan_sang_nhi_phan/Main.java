package dse_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

public class Main {
    public static void main(String[] args) {
        int decimalNumber = 123456789;
        System.out.print("So nhị phân của " + decimalNumber +" là :");
        new DecimalToBinary().convertBinary(decimalNumber);
    }
}

