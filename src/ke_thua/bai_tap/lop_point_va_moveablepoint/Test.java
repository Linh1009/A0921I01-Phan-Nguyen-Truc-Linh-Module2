package ke_thua.bai_tap.lop_point_va_moveablepoint;

public class Test {
    public static void main(String[] args) {
        Point a = new Point(20,30);
        System.out.println(a.toString());
        a.setXY(10,20);
        System.out.println(a.toString());
        a = new MoveablePoint(a.getX(),
                a.getY(),
                10,
                20);
        System.out.println(a.toString());
        ((MoveablePoint) a).move();
        System.out.println(a.toString());
        MoveablePoint b = new MoveablePoint(20,20);
        System.out.println(b.toString());
        b.move();
        System.out.println(b.toString());
    }

}
