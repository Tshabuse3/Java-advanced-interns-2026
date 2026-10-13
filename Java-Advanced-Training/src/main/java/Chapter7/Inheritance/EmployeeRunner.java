package Chapter7.Inheritance;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/12/2026
 **/
public class EmployeeRunner {
    static void main() {
        PermanentEmployee objPEmp = new PermanentEmployee("123456","Jessica Smith", "jess@net.com", 15500);

        ContractEmployee objCEmp = new ContractEmployee("987654","Mike Ross", 38, 250.75);

        objPEmp.display();

        objCEmp.display();
    }
}
