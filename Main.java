import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- STUDENT MANAGEMENT ---");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student Grade");
            System.out.println("3. Edit Student Name");  // New menu option
            System.out.println("4. Delete Student");
            System.out.println("5. Sort Students by Grade");
            System.out.println("6. Search for a Student");
            System.out.println("7. Display All Students");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Full Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    manager.addStudent(new Student(id, name, grade));
                    break;
                case 2:
                    System.out.print("Enter Student ID to Edit Grade: ");
                    id = scanner.nextLine();
                    System.out.print("Enter New Grade: ");
                    grade = scanner.nextDouble();
                    manager.editStudent(id, grade);
                    break;
                case 3:  // New case for editing student name
                    System.out.print("Enter Student ID to Edit Name: ");
                    id = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    name = scanner.nextLine();
                    manager.editStudentName(id, name);
                    break;
                case 4:
                    System.out.print("Enter Student ID to Delete: ");
                    id = scanner.nextLine();
                    manager.deleteStudent(id);
                    break;
                case 5:
                    manager.sortStudents();
                    System.out.println("Students sorted by grade.");
                    break;
                case 6:
                    System.out.print("Enter Student ID to Search: ");
                    id = scanner.nextLine();
                    Student student = manager.searchStudent(id);
                    System.out.println(student != null ? student : "Student not found.");
                    break;
                case 7:
                    manager.displayStudents();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
