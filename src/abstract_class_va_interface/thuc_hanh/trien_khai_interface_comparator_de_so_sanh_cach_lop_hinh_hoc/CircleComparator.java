package abstract_class_va_interface.thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cach_lop_hinh_hoc;
import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}

