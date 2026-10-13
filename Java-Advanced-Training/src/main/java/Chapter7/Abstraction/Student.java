package Chapter7.Abstraction;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/12/2026
 **/
public abstract class Student {

    /**
     * Calculate and return the Semester Mark
     * @param test Test Mark as an integer
     * @param assignment1 Assignment 1 mark as an integer
     * @param assigment2 Assignment 1 mark as an integer
     * @return Semester Mark
     */
    public abstract  double CalculateSemesterMark(int test, int assignment1, int assigment2);

    /**
     * Calculate and return the Final Mark
     * @param semesterMark
     * @return Final Mark
     */
    public abstract  double CalculateFinalMark(double semesterMark);

    /**
     * Display Student details
     */
    public abstract void display();

}
