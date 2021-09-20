package Implementasi_UML_ClassDiagram;

public class SalariedEmployee extends Employee {
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    @Override
    public int payment() { 
        return salary;
    }
