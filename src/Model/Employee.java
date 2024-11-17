package Model;

public abstract class Employee extends Person{
    private int registration;
    private double wage;

    public Employee(int registration, double wage, String name, int age, String address, char sex, double hight, String phone) {
        super(name, age, address, sex, hight, phone);
        this.registration = registration;
        this.wage = wage;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    
    
    
}
