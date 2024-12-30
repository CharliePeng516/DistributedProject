package practice.ood;

public class ConstructMethodPractice {
        public static void main(String[] args) {
//            Person ming = new Person("小明", 12);
//            System.out.println(ming.getName());
//            System.out.println(ming.getAge());
//
//            Person hong = new Person();
//            hong.setName("Mr Xiao", "Hong");
//            System.out.println(hong.getName());

            Student linyi = new Student("Linyi Peng", 81, 24);
            System.out.println(linyi.getName() + " " + linyi.getAge() + " " + linyi.getScore());

        }
}


class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return this.age + "";
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setName(String firstName, String SecondName){
        this.name = firstName + " " + SecondName;
    }
}

class Student extends Person {

    protected int score;

    public Student(String name, int score, int age) {
        super(name, age);
        this.score = score;
    }

    public Student(){}

    public int getScore() { return score; }
    public void setScore(int score) {
        this.score = score;
    }
}