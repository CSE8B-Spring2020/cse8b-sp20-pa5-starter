///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              (program's title)
// Files:              (list of source files)
// Quarter:            (course) Spring 2020
//
// Author:             (your name)
// Email:              (your email address)
// Instructor's Name:  (name of your instructor)
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
//                   CHECK ASSIGNMENT PAGE TO see IF PAIR-PROGRAMMING IS
//                   ALLOWED
//                   If pair programming is allowed:
//                   1. Read PAIR-PROGRAMMING policy (in CSE 8B syllabus)
//                   2. choose a partner wisely
//                   3. complete this section for each program file.
//
// Pair Partner:        (name of your pair programming partner)
// Email:               (email address of your programming partner)
// Instructors's Name:  (name of your partner's instructor)
// Lab Section:         (your partner's lab section number)
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   must fully acknowledge and credit those sources of help.
//                   Instructors and TAs do not have to be credited here,
//                   but roommates, relatives, strangers, etc do.
//
// Persons:          Identify persons by name, relationship to you, and email.
//                   Describe in detail the the ideas and help they provided.
//
// Online sources:   avoid web searches to solve your problems, but if you do
//                   search, be sure to include Web URLs and description of
//                   of any information you find.
//////////////////////////// 80 columns wide //////////////////////////////////
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class that contains the main for the Employee program
 *
 * Bugs: (a list of bugs and other problems)
 *
 * @author (your name)
 */
public class EmployeeMain {
    public static final String AVG_PAY_STR = "Average pay of employees: ";
    public static final String CATEGORIES_STR = "Employee category count: ";
    public static final String ERROR_MSG
        = "USAGE: java EmployeeMain <inFile> <outFile>";
    
    /**
     * The main method for the program
     * 
     * @param args The first element is the filename to read from
     *             The second element is the filename to write to
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.out.println(ERROR_MSG);
            return;
        }
        // args[0] - inputFile; args[1] - outputFile
        Employee[] employees = readEmployeesFromFile(args[0]);
        System.out.println(AVG_PAY_STR + averagePay(employees));
        System.out.println(CATEGORIES_STR
                            + Arrays.toString(categoryCount(employees)));
        printEmployeeDetails(employees);
        printSpecificDetails(employees);
        writeEmployeesToFile(employees, args[1]);
    }

    /**
     * Reads employee data from a file and stores it in an array of
     * Employees.
     * 
     * @param inputFile The file to read employee data from
     * @return The array of Employees
     * @throws FileNotFoundException
     */
    public static Employee[] readEmployeesFromFile(String inputFile)
            throws FileNotFoundException {
        // Method to implement
        return null;
    }

    /**
     * Computes the average biweekly pay for all employees
     * 
     * @param empArr The array of all employees
     * @return The average pay
     */
    public static double averagePay(Employee[] empArr) {
        // Method to implement
        return 0.0;
    }

    /**
     * Computes the count of each type of employees and returns
     * the counts in an int array of [hourly, salaried, commission]
     * 
     * @param empArr The array of all employees
     * @return The counts for each type of employee
     */
    public static int[] categoryCount(Employee[] empArr) {
        // Method to implement
        return null;
    }

    /**
     * Prints the details of all the employees using the same format from
     * the toString method
     * 
     * @param empArr The array of all employees
     */
    public static void printEmployeeDetails(Employee[] empArr) {
        // Method to implement
    }

    /**
     * Prints the details of all the employees using the same format from
     * the toString method
     *
     * @param empArr The array of all employees
     */
    public static void printSpecificDetails(Employee[] empArr) {
        // Method to implement
    }
    
    /**
     * Writes the details of all employees to a file using the same format from
     * the toString method appended with each employees biweekly pay
     * 
     * @param empArr The array of all employees
     * @param outputFile The filename to write to
     * @throws FileNotFoundException
     */
    public static void writeEmployeesToFile(Employee[] empArr,
            String outputFile) throws FileNotFoundException {
        // Method to implement
    }
}
