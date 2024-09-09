package Javaproject;
import java.util.Scanner;
public class StudentAttendance { //creating a class
	// Array to store students
	private Student[] students;
    private int studentCount;  // Variable to keep track of the number of students added
    private Scanner scanner;  // Scanner object to read user input

    public StudentAttendance(int maxStudents) {  // Constructor to initialize the student attendance system
        students = new Student[maxStudents];
        studentCount = 0;
        scanner = new Scanner(System.in);
    }
 // Method to add a new student
    public void addStudent() { 
        if (studentCount < students.length) { //Loop statement
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            Student student = new Student(name, id);
            students[studentCount++] = student;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Maximum number of students reached!");
        }//End of else block
    }
 // Method to mark attendance of a student
    public void markAttendance() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        for (int i = 0; i < studentCount; i++) { //Loop 
            if (students[i].getId() == id) {
                System.out.print("Is " + students[i].getName() + " present? (p/a): ");
                char response = scanner.next().charAt(0);
                if (response == 'p') {  // Mark student as present
                    students[i].setPresent(true);
                    System.out.println("Attendance marked successfully!");
                } else if (response == 'a') {   // Mark student as absent
                    students[i].setPresent(false);
                    System.out.println("Attendance marked successfully!");
                }else {
                    System.out.println("Invalid response. Please enter p or a.");
                }
                return;
            }
        }//End of Loop
        System.out.println("Student not found!");
    }
 // Method to view attendance of all students
    public void viewAttendance() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Name: " + students[i].getName() + ", ID: " + students[i].getId() + ", Present: " + students[i].isPresent() + ", Absent: " + students[i].isAbsent());
        }
    }
//main method 
    public static void main(String[] args) {
        StudentAttendance attendance = new StudentAttendance(10);
        Scanner scanner = new Scanner(System.in);

        while (true) { //loop
            System.out.println("1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Attendance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) { //switch case
                case 1:
                    attendance.addStudent();
                    break;
                case 2:
                    attendance.markAttendance();
                    break;
                case 3:
                    attendance.viewAttendance();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }//End of switch case
        }//End of while loop
    }//End of main method
}//End of class block


