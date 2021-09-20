package Implementasi_UML_ClassDiagram;

public class HourlyEmployee extends Employee {
  private int hoursWorked;
    private int hourlyPayment;

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHourlyPayment(int hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }
    public int getHourlyPayment() {
        return hourlyPayment;
    }
    @Override
    public int payment() {
        return hoursWorked*hourlyPayment;
    }
}
