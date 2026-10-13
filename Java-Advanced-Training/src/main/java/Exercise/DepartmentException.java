package Exercise;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/13/2026
 **/
public class DepartmentException  extends Exception{
    public DepartmentException(String department, int departmentId, int maxEmployees) {
        super("Invalid Department  " + department
                + ", ID: " + departmentId
                + ", Max Employees: " + maxEmployees);
    }
}
