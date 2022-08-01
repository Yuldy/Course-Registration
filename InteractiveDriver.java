import java.util.Scanner;
public class InteractiveDriver {

    public static void main(String args[]) {
        //CREATE COURSE OBJECT
        Course course1 = new Course("Introduction to Python", 5, 5);
        boolean program = false;

        Scanner scan = new Scanner(System.in);
        while (!program) {
            System.out.println("\n\nWelcome to the Course Registration system for the following course.");
            System.out.println(course1);
            System.out.println("\nWhat action would you like to take");
            System.out.println("1 to add a student");
            System.out.println("2 to drop a student");
            System.out.println("3 to print the course");
            System.out.println("4 to exit");

            String input = scan.nextLine();

            //OPTION 1: ADD STUDENT
            if (input.contains("1")) {
                boolean tuitionPaid = false;
                System.out.println("Enter the student's name: ");
                String studentName = scan.nextLine();

                System.out.println("Enter the student's ID: ");
                String studentID = scan.nextLine();
                studentID = studentID.toUpperCase();

                boolean validInput = false;
                while (!validInput) {
                    System.out.println("Has the student paid tuition yet? Enter y or n: ");
                    tuitionPaid = false;
                    String studentTuition = scan.nextLine();
                    if (studentTuition.equalsIgnoreCase("y")) {
                        tuitionPaid = true;
                        System.out.println(studentName + "( " + studentID + ") " + "added successfully to either roster or waitlist");
                        validInput = true;
                    } else if (studentTuition.equalsIgnoreCase("n")) {
                        tuitionPaid = false;
                        System.out.println(studentName + " (" + studentID + ") not added");
                        validInput = true;
                    } else {
                        System.out.println("Invalid Input: Try again.");
                        validInput = false;
                    }
                }
                Student addStud = new Student(studentName, studentID, tuitionPaid);
                course1.addStudent(addStud);
                System.out.println(course1.toString());

                //OPTION 2: DROP STUDENT
            } else if (input.contains("2")) {
                boolean tuitionPaid = false;
                System.out.println("Enter the student's name: ");
                String studentName = scan.nextLine();

                System.out.println("Enter the student's ID: ");
                String studentID = scan.nextLine();
                studentID = studentID.toUpperCase();

                boolean validInput = false;
                while (!validInput) {
                    System.out.println("Has the student paid tuition yet? Enter y or n: ");
                    tuitionPaid = false;
                    String studentTuition = scan.nextLine();
                    if (studentTuition.equalsIgnoreCase("y")) {
                        tuitionPaid = true;
                        System.out.println(studentName + "( " + studentID + ") " + "dropped successfully from either roster or waitlist");
                        validInput = true;
                    } else if (studentTuition.equalsIgnoreCase("n")) {
                        tuitionPaid = false;
                        System.out.println(studentName + "( " + studentID + ") " + "dropped successfully from either roster or waitlist");
                        validInput = true;
                    } else {
                        System.out.println("Invalid Input: Try again.");
                        validInput = false;
                    }
                }
                Student dropStud = new Student(studentName, studentID, tuitionPaid);
                course1.dropStudent(dropStud);
                System.out.println(course1.toString()); //test

                //OPTION 3: PRINT COURSE
            } else if (input.contains("3")) {
                System.out.println(course1.toString());

                //OPTION 4: EXIT PROGRAM
            } else if (input.contains("4")) {
                program = true; //EXITS PROGRAM

            } else {
                System.out.println("Invalid Input, please try again."); //IF USER INPUT IS NOT EITHER OPTIONS, RE-DOES THE LOOP
            }

        }
    }
}