package Chapter8;

import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/13/2026
 **/
public class ExploreExceptions {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String name;
        int numerator, denominator;
        double quotient;

        try {
            System.out.println("Enter your name");
            name = sc.nextLine();
            System.out.println("Enter numerator....");
            numerator = sc.nextInt();
            System.out.println("Enter denominator....");
            denominator = sc.nextInt();

            quotient = numerator / denominator;

            name = "Joy";

            System.out.printf("""
Name         : %s
The last letter of your name(%s) is: %s
Numerator    : %d
Denominator  : %d
Quotient     : %.2f
""", name, name, numerator, denominator, quotient);

        } catch (InputMismatchException ex) {
            System.err.println("Incorrect input type. " + ex.getCause());

        }catch(ArithmeticException ex){
            System.err.println("Cannot divide by zero");

        }catch(StringIndexOutOfBoundsException ex){
            System.err.println("The last letter of your name should be y ");
        }
    }
}



