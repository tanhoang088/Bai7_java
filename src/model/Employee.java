package model;

public abstract class Employee {
    private String ID;
    private String name;
    private String dateOfBirth;
    private int salary;

    public Employee(String ID, String name, String dateOfBirth, int salary) {
        this.ID = ID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }
    public Employee(){}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void getSalary();
    public abstract void showInfor();
}
