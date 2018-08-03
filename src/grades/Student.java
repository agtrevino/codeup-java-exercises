package grades;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int total = 0;
        for(int grade : grades){
            total+=grade;
        }
        return total / grades.size();
    }

    public static void main(String[] args) {
        Student kappa = new Student("Kappa");
        kappa.grades.add(56);
        kappa.grades.add(65);
        System.out.println(kappa.grades);
        System.out.println(kappa.getGradeAverage());
    }
}
