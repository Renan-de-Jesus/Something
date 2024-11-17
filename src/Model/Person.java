package Model;

public abstract class Person {
    private String name;
    private int age;
    private String address;
    private char sex;
    private double hight;
    private String phone;

    public Person(String name, int age, String address, char sex, double hight, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
        this.hight = hight;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
