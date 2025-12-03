package constructor;

public class Student{
    int id;
    String name;

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    static void main() {
        Student s1 = new Student(1,"suz");
        Student s2 = new Student(2,"kosal");
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}