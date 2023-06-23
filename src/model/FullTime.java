package model;

public class FullTime extends Employee{
    private int workDay;

    public FullTime(String ID, String name, String dateOfBirth, int salary, int workDay) {
        super(ID, name, dateOfBirth, salary);
        this.workDay = workDay;
    }
    public FullTime(){

    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    @Override
    public void getSalary(){

    }
    @Override
    public void showInfor(){

    }
}
