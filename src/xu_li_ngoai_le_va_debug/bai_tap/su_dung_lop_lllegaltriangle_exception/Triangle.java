package xu_li_ngoai_le_va_debug.bai_tap.su_dung_lop_lllegaltriangle_exception;

public class Triangle {
    public int a;
    public int b;
    public int c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException{
        this.a = a;
        this.b = b;
        this.c = c;
        if(a > 0 && b > 0 && c > 0){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else throw new IllegalTriangleException("Tam giác không họp lệ");
    }
}
