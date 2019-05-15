package oopstudent;

public class OOPstudent {

    public static void main(String[] args){

        Student akash = new Student(1, "Akash", 25);
        Student mallikarjun = new Student();


        System.out.println(akash.getRollno() + " " + akash.getName() + " " + akash.getAge());


        mallikarjun.setRollno(2);
        mallikarjun.setName("Mallikarjun");
        mallikarjun.setAge(35);


        System.out.println(mallikarjun.getRollno() + " " + mallikarjun.getName() + " " + mallikarjun.getAge());

        Mtechstudent amit = new Mtechstudent(15, "Amitkumar", 20, 75, "Netwroking");
        Mtechstudent varun = new Mtechstudent();

        System.out.println(amit.getRollno() + " " + amit.getName() + " " + amit.getAge() +
                " " + amit.getMarks() + " " + amit.getSpecilaisation());


        System.out.println("supervar of sublcasss - " + amit.supervar);
        System.out.println("supervar of superclass - " + amit.getSupervar());

    }
}
