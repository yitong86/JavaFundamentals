package com.careerdev.intro;

public class Employee {
    //Encapsulation
    private  int baseSalary;
    private int hourlyRate;

    public  static int numberOfEmployees;
    public  Employee(int baseSalary) {
       this(baseSalary,0);
    }
    public  Employee(int baseSalary,int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    public  static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
        new Employee(1000).calculateWage(12);
    }

    public static void main(String[] args) {
     new Employee(10_000);
    var employee = new Employee(50_000,20);
        Employee.printNumberOfEmployees();
    // var employee = new Employee();
//    employee.setBaseSalary(-1);
//    employee.getBaseSalary();
//    employee.setHourlyRate(20);
//    employee.baseSalary = 50_000;
//    employee.setHourlyRate(20);

    int wage = employee.calculateWage(10);
    }


    public  int calculateWage(int extraHours) {
        return  baseSalary + (getHourlyRate() * extraHours);
    }
    public  void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;

    }
    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw  new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }
}
