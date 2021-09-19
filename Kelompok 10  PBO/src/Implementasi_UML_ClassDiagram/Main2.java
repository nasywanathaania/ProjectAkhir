/*
KELOMPOK 10
Ahmad Al Farizi          2017051060
Nasywa Nathania Wirawan  2017051051
Zaki Nugraha Muhammad    09031281924045
*/
package Implementasi_UML_ClassDiagram;

public class Main2 {
    public static void main(String []args) { 
        Employee[] emp = new Employee [2];
        SalariedEmployee sEmp = new SalariedEmployee();
        HourlyEmployee hEmp = new HourlyEmployee();
        emp[0] = sEmp; 
        emp[1] = hEmp;
        
    }
}
