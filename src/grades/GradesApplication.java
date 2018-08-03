package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        initApp();

        HashMap<String, Student> students = new HashMap();

        Student s1 = new Student("Kappa");
        s1.addGrade(100);
        s1.addGrade(45);
        s1.addGrade(55);
        s1.addGrade(94);

        Student s2 = new Student("Krappa");
        s2.addGrade(80);
        s2.addGrade(78);
        s2.addGrade(95);
        s2.addGrade(94);

        Student s3 = new Student("Frappa");
        s3.addGrade(80);
        s3.addGrade(78);
        s3.addGrade(75);
        s3.addGrade(94);

        Student s4 = new Student("Stappa");
        s4.addGrade(60);
        s4.addGrade(78);
        s4.addGrade(100);
        s4.addGrade(94);

        //keys V
        students.put("Alpha", s1);
        students.put("Beta", s2);
        students.put("Gamma", s3);
        students.put("Delta", s3);

        System.out.println(students);
        System.out.println(students.get("Gamma").getGradeAverage());
    }
    public static void initApp(){

    }

}
