import java.util.Scanner;
public class Student_grade_system {
    static String student1 = "";
    static String student2 = "";
    static String student3 = "";
    static int grade1 = -1;
    static int grade2 = -1;
    static int grade3 = -1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Grade Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show Stats");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            if (choice == 1) addStudent(input);
            else if (choice == 2) showStats();
            else if (choice == 3) searchStudent(input);
        } while (choice != 4);
        if (choice==4)
            System.out.println("by!!");
    }

    static void addStudent(Scanner input) {
        if (student1.equals("")) {
            System.out.print("Enter student name: ");
            student1 = input.next();
            System.out.print("Enter student grade: ");
            grade1 = input.nextInt();
        } else if (student2.equals("")) {
            System.out.print("Enter student name: ");
            student2 = input.next();
            System.out.print("Enter student grade: ");
            grade2 = input.nextInt();
        } else if (student3.equals("")) {
            System.out.print("Enter student name: ");
            student3 = input.next();
            System.out.print("Enter student grade: ");
            grade3 = input.nextInt();
        } else {
            System.out.println("Already added 3 students. Cannot add more.");
        }
    }

    static void showStats() {
        if (grade1 == -1 || grade2 == -1 || grade3 == -1) {
            System.out.println("Please add 3 students first.");
            return;
        }

        int total = grade1 + grade2 + grade3;
        double average = total / 3.0;

        int highest = Math.max(grade1, Math.max(grade2, grade3));
        int lowest = Math.min(grade1, Math.min(grade2, grade3));

        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }

    static void searchStudent(Scanner input) {
        System.out.print("Enter name to search: ");
        String name = input.next();

        if (name.equals(student1)) {
            System.out.println(student1 + " The grade is : " + grade1);
        } else if (name.equals(student2)) {
            System.out.println(student2 + " The grade is : " + grade2);
        } else if (name.equals(student3)) {
            System.out.println(student3 + " The grade is : " + grade3);
        } else {
            System.out.println("Student not found.");
        }
    }
}