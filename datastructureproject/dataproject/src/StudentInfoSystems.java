import java.util.Scanner;

public class StudentInfoSystems {
    
    public static void main(String[] args) {
        int selection;
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);  
        StudentList studList = new StudentList();
        while (true){
        System.out.println(" ");                         //Menu
        System.out.println("===================================");
        System.out.println("|    Student Information System   |");
        System.out.println("===================================");
        System.out.println("| 1.| Insert new student          |");
        System.out.println("| 2.| Search student              |");
        System.out.println("| 3.| Edit                        |");
        System.out.println("| 4.| Delete                      |");
        System.out.println("| 5.| Display                     |");
        System.out.println("| 6.| Exit                        |");
        System.out.println("===================================");
        System.out.print("Please select an option : ");
        selection = intInputValidation();
        switch (selection){
        case 1 :               //Add student
            System.out.print ("Name: ");
            String name = scan.next() + scan.nextLine();
            System.out.print ("Gender: ");
            String gender = scan.next() + scan.nextLine();
            System.out.print ("Program: ");
            String program = scan.next() + scan.nextLine();
            System.out.print ("Address: ");
            String address = scan.next() + scan.nextLine();
            System.out.print ("Matric no: ");
            int matric = intInputValidation();
            System.out.print ("Date of birth: ");
            String dateOfBirth = scan.next() + scan.nextLine();
            System.out.print ("Semester: ");
            int semester = intInputValidation();
            System.out.print ("Contact Number: ");
            String contactNum = scan.next() + scan.nextLine();
            Student s = new Student (name, gender, program, address, matric, dateOfBirth, semester, contactNum);
            studList.addStudent(s);
            System.out.print("\nEnter any key to continue..");
            scanner.next();
            break;
        case 2  :               //Search student
            System.out.println("Enter matric number of student: ");
            matric = intInputValidation();
            for (int i = 0; i < studList.length(); i++) {
                if (studList.getNode(i).getValue().getMatric() == matric) {
                    System.out.println(""+studList.getNode(i).getValue().toString());
                }
            }
            System.out.print("\nEnter any key to continue..");
            scanner.next();
        break;
        case 3 :               //Edit student
            System.out.println("Enter matric number of student: ");
            matric = intInputValidation();
            for (int i = 0; i < studList.length(); i++) {
                if (studList.getNode(i).getValue().getMatric() == matric) {
                    System.out.println("1. Name");
                    System.out.println("2. Gender");
                    System.out.println("3. Program");
                    System.out.println("4. Address");
                    System.out.println("5. Matric no");
                    System.out.println("6. Date of birth");
                    System.out.println("7. Semester");
                    System.out.println("8. Contact number");
                    System.out.print("Please select what you want to change: ");
                    int optionChange = scanner.nextInt();
                    if (optionChange==1) {
                        System.out.println("Name: ");
                        name = scan.next() + scan.nextLine();
                        studList.getNode(i).getValue().setName(name);
                        }
                    if (optionChange==2) {
                        System.out.println("Gender: ");
                        gender = scan.next();
                        studList.getNode(i).getValue().setGender(gender);
                        }
                    if (optionChange==3) {
                        System.out.println("Program: ");
                        program = scan.next();
                        studList.getNode(i).getValue().setProgram(program);
                        }
                    if (optionChange==4) {
                        System.out.println("Address: ");
                        address = scan.next();
                        studList.getNode(i).getValue().setAddress(address);
                        }
                    if (optionChange==5) {
                        System.out.println("Matric no: ");
                        int matricNum = scan.nextInt();
                        studList.getNode(i).getValue().setMatric(matricNum);
                        }
                    if (optionChange==6) {
                        System.out.println("Date of Birth: ");
                        dateOfBirth = scan.next();
                        studList.getNode(i).getValue().setDateOfBirth(dateOfBirth);
                        }
                    if (optionChange==7) {
                        System.out.println("Semester: ");
                        semester = scan.nextInt();
                        studList.getNode(i).getValue().setSemester(semester);
                        }
                    if (optionChange==8) {
                        System.out.println("Contact number: ");
                        contactNum = scan.next();
                        studList.getNode(i).getValue().setContactNum(contactNum);
                        }
                }
            }
            System.out.print("\nEnter any key to continue..");
            scanner.next();     
        break;
        case 4 :               //Delete student by matric number   
            System.out.println("Enter matric number of student: ");
            matric = intInputValidation();
            for (int i = 0; i < studList.length(); i++) {
                if (studList.getNode(i).getValue().getMatric() == matric) {
                studList.remove(i);
                }
            }
            System.out.print("\nEnter any key to continue..");
            scanner.next();  
        break;
        case 5 :               //Display student
            System.out.println(""+studList.toString());
            System.out.print("\nEnter any key to continue..");
            scanner.next();  
        break;
        case 6 : System.exit(0); //Exit from the system
        }    
        }    
    }
    public static int intInputValidation() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String num = scanner.nextLine();
                number = Integer.parseInt(num);
                if (number < 0) {
                    throw new NumberFormatException();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number: ");
            }

        }
    }
    public static double doubleInputValidation() {
            double number = 0;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    String num = scanner.nextLine();
                    number = Double.parseDouble(num);
                    if (number < 0) {
                        throw new NumberFormatException();
                    }
                    return number;
                } catch (NumberFormatException e) {
                    System.out.print("Please enter a valid number: ");
                }

            }
        }
    
}


