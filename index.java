// GRADING question 1
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int java, Hci, Networking;
        int totalMarks;
        double averageMarks;

        System.out.print("Enter the marks for java: ");
        java = input.nextInt();

        System.out.print("Enter the marks for Hci: ");
        Hci = input.nextInt();

        System.out.print("Enter the marks for Networking: ");
        Networking = input.nextInt();


        totalMarks = java + Hci + Networking ;
        averageMarks = totalMarks / 4.0;
        System.out.println("Average Marks: " + averageMarks);

        if (averageMarks >= 45 && averageMarks <= 50) {
            System.out.println("Grade: A");
        } else if (averageMarks >= 40 && averageMarks <= 44) {
            System.out.println("Grade: B");
        } else if (averageMarks >= 35 && averageMarks <= 39) {
            System.out.println("Grade: C");
        } else if (averageMarks >= 25 && averageMarks <= 34) {
            System.out.println("Grade: D");
        } else if (averageMarks >= 0 && averageMarks <= 24) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
        input.close();
    }
}

// Question 3
import java.util.Scanner;

public class ExamMarks2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter marks for Assignment 1: ");
        int asgnmt1 = scanner.nextInt();

        System.out.println("Enter marks for Assignment 2: ");
        int asgnmt2 = scanner.nextInt();

        System.out.println("Enter marks for CAT 1: ");
        int cat1 = scanner.nextInt();

        System.out.println("Enter marks for CAT 2: ");
        int cat2 = scanner.nextInt();


        double average = (asgnmt1 + asgnmt2 + cat1 + cat2) / 4.0;


        String grade;
        String result;

        if (average >= 93 && average <= 100) {
            grade = "A";
            result = "Pass";
        } else if (average >= 85 && average <=92) {
            grade = "B";
            result = "Pass";
        } else if (average >=80 && average <=84) {
            grade = "C";
            result = "Pass";
        } else if (average >= 75 && average <=79) {
            grade = "D";
            result = "Pass";
        } else {
            grade = "Fail";
            result = "Fail";
        }


        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);


        scanner.close();
    }
}
// SWITCH  JAVA question 2
int day = 4;
switch (day) {
    case 1: System.out.println("Sunday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    case 4: System.out.println("Thursday"); break;
    case 5: System.out.println("Friday"); break;
    case 6: System.out.println("Saturday"); break;
    default: System.out.println("Unknown"); break;
}