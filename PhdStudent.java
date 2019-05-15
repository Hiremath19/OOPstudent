package oopstudent;

public class PhdStudent extends Mtechstudent{

    String thesis;

    public PhdStudent(){};

    public PhdStudent(int marks, String specilaisation, String thesis) {
        super(marks, specilaisation);
        this.thesis = thesis;
    }

    public PhdStudent(String thesis) {
        this.thesis = thesis;
    }

    public PhdStudent(int rollno, String name, int age, int marks, String specilaisation, String thesis) {
        super(rollno, name, age, marks, specilaisation);
        this.thesis = thesis;
    }
}
