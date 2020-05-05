/**
 * Employee class that represents an employee.
 */
public class Employee {
    public static final String EMPTY_STRING = "";
    public static final String DEFAULT_NAME = "Employee";
    public static final String NAME_HEADER = ", name=";
    public static final String EMP_ID_HEADER = "empId=";
    

    int empId;
    String name;

    static int numEmployees;

    /**
     * Constructor that takes in the the employee name
     * 
     * @param name employee name
     */
    public Employee(String name) {
        super();
        this.empId = ++numEmployees;
        if (name.equals(EMPTY_STRING)) {
            this.name = DEFAULT_NAME;
        } else {
            this.name = name;
        }
    }

    /**
     * Getter method for the employee Id
     * 
     * @return employee Id
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * Setter method to set the employee Id
     * 
     * @param empId Employee Id to set
     */
    public void setEmpId(int empId) {
        if (empId < 0) {
            this.empId = 0;
        } else {
            this.empId = empId;
        }
    }

    /**
     * Getter method for the employee name
     * 
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for the employee name
     * 
     * @param name Employee name to set
     */
    public void setName(String name) {
        if (name.equals(EMPTY_STRING)) {
            this.name = DEFAULT_NAME;
        } else {
            this.name = name;
        }
    }

    /**
     * Gets the total number of employees
     * 
     * @return the total number of employees
     */
    public static int getNumEmployees() {
        return numEmployees;
    }

    /**
     * The toString method to print the Employee
     * 
     * @return The string representation of the employee
     */
    @Override
    public String toString() {
        return EMP_ID_HEADER + empId + NAME_HEADER + name;
    }

    /**
     * Gets the biweekly pay of the Employee
     * 
     * @return The biweekly pay of the Employee
     */
    public double getPay() {
        return 0;
    }
}