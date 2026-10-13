package Chapter7;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/12/2026
 **/
public class StudentRunner {
    static void main() {
        Student objStudent =  new Student();
        Student objThabo = new Student("123456","Thabo","Smith", "thabo@gmail.com");

        objThabo.setAssessments(75,74,63);
        System.out.println("====Defalault Constructor========");
        objStudent.display();

        System.out.println("\n============Overloaded Constructor======");
        objThabo.display();
    }
}
