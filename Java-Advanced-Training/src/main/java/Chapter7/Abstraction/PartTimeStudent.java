package Chapter7.Abstraction;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/12/2026
 **/
public class PartTimeStudent extends Student {

    /**
     * Calculate and return the Semester Mark
     *
     * @param test        Test Mark as an integer
     * @param assignment1 Assignment 1 mark as an integer
     * @param assigment2  Assignment 1 mark as an integer
     * @return Semester Mark
     */
    @Override
    public double CalculateSemesterMark(int test, int assignment1, int assigment2) {
        return (test + assignment1 + assigment2) / 3;
    }

    /**
     * Calculate and return the Final Mark
     *
     * @param semesterMark
     * @return Final Mark
     */
    @Override
    public double CalculateFinalMark(double semesterMark) {

        return 0;
    }

    /**
     * Display Student details
     */
    @Override
    public void display() {

    }
}
