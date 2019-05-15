package oopstudent;

public class
Mtechstudent extends Student {

     int marks;
     String specilaisation;
     int supervar = 50;

    public Mtechstudent(int marks, String specilaisation) {
        this.marks = marks;
        this.specilaisation = specilaisation;
    }

    public Mtechstudent() {
    }

    public Mtechstudent(int rollno, String name, int age, int marks, String specilaisation) {
        super(rollno, name, age);
        this.marks = marks;
        this.specilaisation = specilaisation;
    }

    public int getMarks() {
        /*System.out.println("This is marks filed in subclass");
        int i=50*5;
        return marks+i;*/

        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSpecilaisation() {
        return specilaisation;
    }

    public void setSpecilaisation(String specilaisation) {
        this.specilaisation = specilaisation;
    }

    public int getSupervar() {
        return super.supervar;
    }


}
