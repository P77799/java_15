class Person {
    String name;
    int age;

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

class Students extends Person {
    int studentid;
    String course;

    Students(String name, int age, int studentid, String course) {
        this.name = name;
        this.age = age;
        this.studentid = studentid;
        this.course = course;
    }

    void studentinfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("Student ID: " + studentid);
        System.out.println("Course    : " + course);
    }
}

class Teacher extends Person {
    int teacherid;
    float salary;

    Teacher(String name, int age, int teacherid, float salary) {
        this.name = name;
        this.age = age;
        this.teacherid = teacherid;
        this.salary = salary;
    }

    public void teacherinfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("Teacher ID: " + teacherid);
        System.out.println("Salary    : " + salary);
    }
}

public class day19 {
    public static void main(String[] args) {

        Students s1 = new Students("Pratik_sir", 19, 7, "Artificial Intelligence");
        s1.studentinfo();

        System.out.println();

        Teacher t1 = new Teacher("Ram Sir", 35, 102, 55000.0f);
        t1.teacherinfo();
    }
}
