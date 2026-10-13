package Chapter7;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/12/2026
 **/
public class Student {
    private String studentNum;
    private String firstname;
    private String lastname;
    private String email;
    private int testMark, assignment1,assignment2;

    /**
     * Construct an object of Student with attribute
     * @param studentNum Student Number
     * @param firstname First Name
     * @param lastname Last Name
     * @param email Email
     */
    public Student(String studentNum, String firstname, String lastname, String email) {
        setStudentNum(studentNum);
       setFirstname(firstname);
        setLastname(lastname);
        setEmail(email);
    }

    public Student() {
        studentNum = "000000";
        firstname = "No name";
        lastname = "No lastname";
        email = "none";
        testMark = 0;
        assignment1 = 0;
        assignment2 = 0;


    }

    private void setStudentNum(String stNum) {
        this.studentNum = "ST-26" + stNum;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAssessments(int test,int assignment1, int assignment2) {
        this.testMark = test;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
    }

    public String getStudentNum(){
        return studentNum;
    }

    public String getName() {
        return firstname + " " + lastname;
    }
    public String getEmail(){
        return email;
    }

    public double getSemesterMark() {
        //test will be * 40%, a1 * 35%, a2 * 25%
        return (this.testMark * 0.4) + (this.assignment1 * 0.35) + (assignment2 * 0.25);

    }
    public void display(){
        System.out.println("Student#: " + getStudentNum());
        System.out.println("Name#: " + getName());
        System.out.println("Email#: " +getEmail());
        System.out.println("Semester Mark#: " + getSemesterMark());
    }

}
