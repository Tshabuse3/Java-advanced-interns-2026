package Exercise;

import javax.management.MBeanAttributeInfo;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/13/2026
 **/
public class ThrowDepartmentException {
    static void main() {

                String[] departments = {"IT", "FIN", "ADMIN", "CLEANING", "MEDIA"};

                int[] ids = {103, 252, 124, 503,353, 457};

                int[] employees = {5, 8, 6, 7, 3, 12};

                for (int i = 0; i < departments.length; i++)
                {
                    try
                    {
                        Department dept = new Department(departments[i], ids[i], employees[i]);

                        System.out.println(
                                "Department created successfully:");
                        System.out.println(dept);
                    }
                    catch (DepartmentException ex)
                    {
                        System.out.println(
                                "Department can not be created.");
                        System.out.println(ex.getMessage());
                        System.out.println();
                    }
                }
            }
        }

