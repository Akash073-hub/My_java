import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main_1{
    public static void main(String[] args) throws InvalidMarkException {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(101, "Rahul", new int[]{85, 78, 92, 80, 78},18));
        studentSet.add(new Student(102, "Sneha", new int[]{95, 90, 88, 92, 91},19));
        studentSet.add(new Student(103, "Amit", new int[]{60, 70, 55, 65, 72},20));
        studentSet.add(new Student(101, "Rahul", new int[]{85, 78, 92, 80, 78},21));
        Map<Integer, Student> studentMap = new HashMap<>();
        
        for (Student s : studentSet) {
            studentMap.put(s.rollNumber, s);
        }
        // Operation var_1 = () ->{
    
        // };
        Object lock = new Object();  // common lock object

        Student[] students = {
            new Student(101, "Rahul", new int[]{85, 78, 92, 80, 78},20),
            new Student(102, "Sneha", new int[]{95, 90, 88, 92, 91},12),
            new Student(103, "Amit", new int[]{60, 70, 55, 65, 72},12)
        };
        Thread t1 = new Thread(new PrintNames(students, lock));
        Thread t2 = new Thread(new PrintTotals(students, lock));

        t1.start();
        t2.start();
        try {
    FileWriter writer = new FileWriter("students.txt");

    // Use studentSet or students array
    for (Student s : students) {
        int total = 0;
        for (int m : s.marks) total += m;

        writer.write("Roll: " + s.rollNumber + ", Name: " + s.name +
                     ", Marks: " + java.util.Arrays.toString(s.marks) +
                     ", Total: " + total + "\n");
    }

    writer.close();
    System.out.println("Student list saved to students.txt successfully!");
} catch (IOException e) {
    System.out.println("Error writing to file: " + e.getMessage());
}

    }
    
}
class Person extends Record{
    String name;
    int age;

    public Person(String name,int age) {
        this.name=name;
        this.age=age;
    }
    public void displayDetails(){
        System.out.println("details" +  name + age);
    }

    @Override
    void displayRecord() {
        System.out.println("the");
    }
    
}
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

class Student extends Person implements Evaluatable,Operation{
    int rollNumber;
    int marks [] = new int[5];
    protected  int sum = 0;
    private static int count=0;

    public Student(int rollNumber,String name ,int marks[],int age)throws InvalidMarkException {
        super(name,age);
        this.rollNumber=rollNumber;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new InvalidMarkException("Mark " + marks[i] + " is invalid! Must be 0–100.");
            }
            this.marks[i] = marks[i];
        }
        this.marks=marks;
        count++;
    }

    public static int getcount(){
        return count;
    }
    int getTotalMarks(){
        for(int i: marks){
            sum += i;
        }
        return sum;
    }
    int getTotalMarks(int bonus){
        return sum + bonus;
    }
    void Marks(){
        int max = marks[0];
        int min = Integer.MAX_VALUE ;
        for (int j : marks){
            if(max < j){
                max = j;
            }
            if(min > j){
                min = j;
            }

        }
        System.out.println(max);
        System.out.println(min);
        int avg = sum / marks.length;
        System.out.println(avg);
    }
    @Override
    public void displayDetails(){

    }
    @Override
    public String evaluateResult(){
        for (int k : marks){
            if(k < 40){
                return "pass";
            }
        }
        return "fail";
    }
    class Address{
        String city;
        String state;
        int pincode;

        public Address(int pincode,String city,String state) {
            this.city=city;
            this.pincode=pincode;
            this.state=state;
        }
        
    }
    @Override
    public void apply(int a, int b) {
        throw new UnsupportedOperationException("Unimplemented method 'apply'");
    }
    
}
abstract class Record{
    abstract void displayRecord();
}
@FunctionalInterface
interface Evaluatable{
    String evaluateResult();
}
@FunctionalInterface
interface Operation{
    void apply(int a, int b);
}
class PrintNames implements Runnable {
    private final Student[] students;
    private final Object lock;

    public PrintNames(Student[] students, Object lock) {
        this.students = students;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {  // synchronized block
            System.out.println("Student Names:");
            for (Student s : students) {
                System.out.println(s.name);
                try { 
                    Thread.sleep(100); 
                }
                catch (InterruptedException e) {
                    
                }
            }
        }
    }
}

class PrintTotals implements Runnable {
    private final Student[] students;
    private final Object lock;

    public PrintTotals(Student[] students, Object lock) {
        this.students = students;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {  // synchronized block
            System.out.println("Student Total Marks:");
            for (Student s : students) {
                System.out.println(s.name + " → " + s.getTotalMarks());
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        }
    }
}
