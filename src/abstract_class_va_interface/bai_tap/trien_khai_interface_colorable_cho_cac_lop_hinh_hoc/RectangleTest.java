package abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

    }
}
