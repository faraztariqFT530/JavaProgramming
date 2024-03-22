package Day10;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.empName = "RajaGee";
        emp1.empId = 1;
        emp1.empJob = "SQA Engineer";
        emp1.empSal = 999999999;
        emp1.display();

        Employee emp2 = new Employee();
        emp2.empName = "Shapatar";
        emp2.empId = 2;
        emp2.empJob = "SQA Engineer";
        emp2.empSal = 50000000;
        emp2.display();


    }
}
