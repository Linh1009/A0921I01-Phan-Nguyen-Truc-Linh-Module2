package access_modifier_static_method_static_property.thuc_hanh.static_method;

public class Student {
    private int rollon;
    private String name;
    private static String college = "BBDIT";

    public Student(int rollon, String name) {
        this.rollon = rollon;
        this.name = name;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollon + " " + name + " " +college);
    }
}