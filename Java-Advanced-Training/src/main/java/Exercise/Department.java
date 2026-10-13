package Exercise;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/13/2026
 **/
public class Department {

        private String department;
        private int departmentId;
        private int maxEmployees;

        public Department(String department, int departmentId,int maxEmployees) throws DepartmentException {
            if (department.length() != 2) {
                throw new DepartmentException(department,
                        departmentId, maxEmployees);
            }

            if (departmentId < 100 || departmentId > 499) {
                throw new DepartmentException(department,
                        departmentId, maxEmployees);
            }

            if (maxEmployees < 4 || maxEmployees > 10) {
                throw new DepartmentException(department,
                        departmentId, maxEmployees);
            }

            this.department = department;
            this.departmentId = departmentId;
            this.maxEmployees = maxEmployees;
        }

        @Override
        public String toString()
        {
            return String.format("""
                Department   : %s
                Department ID: %d
                Employees    : %d
                """,department, departmentId, maxEmployees);
        }
    }

