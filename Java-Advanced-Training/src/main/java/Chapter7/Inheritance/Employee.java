package Chapter7.Inheritance;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/12/2026
 * Parent class
 **/
public class Employee {
 protected String empNumber;
 protected String name;
 protected String email;

    public Employee(String empNumber, String name, String email) {
        this.empNumber = empNumber;
        this.name = name;
        this.email = email;

    }
    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display(){
        System.out.println("Employee#: " + getEmpNumber());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
    }
}
