class Student{
    String name;
    int age;
    public void info(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}



public class day15 {
    public static void main(String[] args){
        Student sct=new Student();
        sct.name="pratik_sir";
        sct.age=18;
        sct.info();


    }
}
