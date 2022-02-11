package case_study.models;

public abstract class Person {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String idCard;
    private String email;


    public Person() {
    }

    public Person(int id, String name, int age, String sex, String idCard, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.idCard = idCard;
        this.email = email;
    }
}
