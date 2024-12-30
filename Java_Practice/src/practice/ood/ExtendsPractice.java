package practice.ood;

public class ExtendsPractice {
    public static void main(String[] args) {
        Person person = new Person("Ming", 12);
        Student stu = new Student("Hong", 20, 99);
        Student ps = new PrimaryStudent("Jun", 9, 100, 5);

        System.out.println(ps.getScore());
        if (ps instanceof PrimaryStudent) {
            System.out.println(((PrimaryStudent) ps).getGrade());
        }
    }
}

class PrimaryStudent extends Student {
    protected int grade;

    public PrimaryStudent(String name, int age, int grade, int score) {
        super(name, age, score);
        this.grade = grade;
    }

    public PrimaryStudent(){

    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}