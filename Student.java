package Javaproject;
//Creating a Student class
public class Student {
	private String name;  //Student Name
    private int id; // Student ID
    private boolean present; //To indicate if student is present
    private boolean absent; //To indicate if student is absent
    // Constructor to initialize a new student
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.present = false;
        this.absent = false;
    }
 // Getter method for student name
    public String getName() {
        return name;
    }
 // Getter method for student ID
    public int getId() {
        return id;
    }
    public boolean isPresent() {
        return present;
    }
 // Setter method for present status
    public void setPresent(boolean present) {
        this.present = present;
        this.absent = false;
    }
    public boolean isAbsent() {
        return absent;
    }
 // Setter method for absent status
    public void setAbsent(boolean absent) {
        this.absent = absent;
        this.present = false;
    }
}
