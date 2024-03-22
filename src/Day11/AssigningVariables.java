package Day11;

public class AssigningVariables {
    int studentId;
    String studentName;
    char grade;

    void printStudentData(){
        System.out.println("Student id is " + studentId + ". Student name is " + studentName + ". Student grade is " + grade);
    }

    void setStudentData(int id, String name, char stgrade){
        studentId=id;
        studentName=name;
        grade=stgrade;
    }

    //constructor
    AssigningVariables(int id, String name, char stgrade){
        studentId=id;
        studentName=name;
        grade=stgrade;
    }
}
