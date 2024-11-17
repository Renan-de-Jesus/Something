
package Model;

public final class trainee extends Employee{
    private int internshipGrant;
    private double hoursOfService;

    public trainee(int internshipGrant, double hoursOfService, int registration, double wage, String name, int age, String address, char sex, double hight, String phone) {
        super(registration, wage, name, age, address, sex, hight, phone);
        this.internshipGrant = internshipGrant;
        this.hoursOfService = hoursOfService;
    }

    public int getInternshipGrant() {
        return internshipGrant;
    }

    public void setInternshipGrant(int internshipGrant) {
        this.internshipGrant = internshipGrant;
    }

    public double getHoursOfService() {
        return hoursOfService;
    }

    public void setHoursOfService(double hoursOfService) {
        this.hoursOfService = hoursOfService;
    }
    
    
}
