package dse_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

import java.util.Stack;

public class DecimalToBinary {
    public void convertBinary(int num) {

        Stack<Integer> stack = new Stack<Integer>();

        while (num != 0) {


            int d = num % 2;


            stack.push(d);

            num /= 2;

        }

        while (!(stack.isEmpty())) {

            System.out.print(stack.pop());

        }
    }
    }
