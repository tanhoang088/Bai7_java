package model;

public class PartTime extends Employee{
    private int workDay;

    public PartTime(String ID, String name, String dateOfBirth, int salary, int workDay) {
        super(ID, name, dateOfBirth, salary);
        this.workDay = workDay;
    }
    public PartTime(){

    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public PartTime(int workDay) {
        this.workDay = workDay;
    }

    @Override
    public void getSalary() {

    }

    @Override
    public void showInfor() {

    }
}
