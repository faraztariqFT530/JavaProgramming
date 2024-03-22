package Day11;

public class AssigningVariablesMain {
    public static void main(String[] args) {
        //AssigningVariables v1 = new AssigningVariables();
        //1. using object reference variables
       /* v1.studentId=1;
        v1.studentName="Faraz";
        v1.grade='B';
        */

        //2. using setter method
       // v1.setStudentData(101, "RajaGee", 'A');
       // v1.printStudentData();

        //3. using Constructor
        //Constructor name should be same as class name
        //Constructor doesnot return any value, not even void
        //Constructor takes parameters
        //Only variables initialization can take place in Constructor
        //No logic should be there in Constructor
        //We can write multiple constructors but everytime, parameters will be different
        //At the time of object calling, Constructor is automatically called
        AssigningVariables v1 = new AssigningVariables(101, "RajaGee", 'A');
        v1.printStudentData();
    }
}
