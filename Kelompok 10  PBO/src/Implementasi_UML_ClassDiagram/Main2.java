/*
KELOMPOK 10
Ahmad Al Farizi          2017051060
Nasywa Nathania Wirawan  2017051051
Zaki Nugraha Muhammad    09031281924045
Link Github: https://github.com/nasywanathaania/ProjectAkhir
*/
package Implementasi_UML_ClassDiagram;

public class Main2 {
    public static void main(String []args) { 
        Employee[] emp = new Employee [2];
        SalariedEmployee sEmp = new SalariedEmployee();
        HourlyEmployee hEmp = new HourlyEmployee();
        emp[0] = sEmp; 
        emp[1] = hEmp;
        
        sEmp.setName("Nasywa");
        sEmp.setAfm("2017051051");
        sEmp.setSalary(10000000);
        
        hEmp.setName("Ahmad");
        hEmp.setAfm("2017051060");
        hEmp.setHourlyPayment(10000);
        hEmp.setHoursWorked(300);
        
        for (Employee i : emp) {
            System.out.printf("Employee Name \t: %s \n", i.getName());
            System.out.printf("Employee AFM \t: %s \n", i.getAfm());
            System.out.printf("Employee Salary : Rp. %d \n\n", i.payment());
        }
        
    }
 
}
