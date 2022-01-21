package xu_li_ngoai_le_va_debug.bai_tap.su_dung_lop_lllegaltriangle_exception;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = null;
        try{
            triangle = new Triangle(2,4,3);
        }catch (IllegalTriangleException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(triangle);
    }
}
