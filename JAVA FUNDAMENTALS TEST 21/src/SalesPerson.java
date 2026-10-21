import java.util.Scanner;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/21/2026
 **/
public class SalesPerson {
    Scanner input = new Scanner(System.in);

    String[] arPersons;
    double[][] arSales;

    String selectedName = "";

    // 1. Initialize arrays
    public void Initialize() {


        String[] arPersons = new String[]{"Thabo", "Loraine", "Zama", "Peter"};
        arSales = new double[][]{
                {17550, 14500, 11000, 12500},
                {15000, 12000, 12500, 16800},
                {15620, 18100, 21500, 17630},
                {15755, 13900, 12950, 19200}
        };
    }

    // 2. Find salesperson by name
    public int findSalesPerson(String name) {

        for (int i = 0; i < arPersons.length; i++) {

            if (arPersons[i].equals(name)) {
                return i;
            }
        }

        return -1;
    }

    // 3. Calculate total monthly sales
    public double calcTotalMonthlySales() {

        int position = findSalesPerson(selectedName);

        double total = 0;

        if (position != -1) {

            for (int i = 0; i < arSales[position].length; i++) {
                total = total + arSales[position][i];
            }
        }

        return total;
    }

    // 4. Calculate monthly salary
    public double calcMonthlySalary() {

        double monthlySales = calcTotalMonthlySales();

        return 7500 + (monthlySales * 0.10);
    }

    // 5. Calculate company monthly turnover
    public double calcMonthlyTurnOver() {

        double turnover = 0;

        for (int i = 0; i < arSales.length; i++) {

            for (int j = 0; j < arSales[i].length; j++) {
                turnover = turnover + arSales[i][j];
            }
        }

        return turnover;
    }

    // 6. Calculate total salary expenditure
    public double calcSalaryExpenditure() {

        double expenditure = 0;

        for (int i = 0; i < arPersons.length; i++) {

            selectedName = arPersons[i];

            expenditure = expenditure + calcMonthlySalary();
        }

        return expenditure;
    }

    // 7. Find best salesperson
    public void getBestSalesPerson() {

        int bestPosition = 0;
        double highestSales = 0;

        for (int i = 0; i < arPersons.length; i++) {

            selectedName = arPersons[i];

            double monthlySales = calcTotalMonthlySales();

            if (monthlySales > highestSales) {
                highestSales = monthlySales;
                bestPosition = i;
            }
        }

        System.out.println("Best Salesperson in the team: "
                + arPersons[bestPosition]);

        System.out.println("Monthly Sales: R" + highestSales);
    }

    // 8. Display all salespeople

    public void display() {

        System.out.println("Name\tWeek 1\tWeek 2\tWeek 3\tWeek 4\tTotal Sales");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < arPersons.length; i++) {

            double total = 0;

            for (int j = 0; j < arSales[i].length; j++) {
                total = total + arSales[i][j];
            }

            System.out.print(arPersons[i] + "\t");

            for (int j = 0; j < arSales[i].length; j++) {
                System.out.print(arSales[i][j] + "\t");
            }

            System.out.println(total);
        }
    }


    // Main menu
    public static void main(String[] args) {

        SalesPerson sc = new SalesPerson();

        sc.Initialize();

        int choice;


        String answer;

        do {

            System.out.println("\nPlease select a menu item below ENJOYYYY!!!:");
            System.out.println("1 - See All Salespeople");
            System.out.println("2 - Find Salesperson");
            System.out.println("3 - Total Monthly Sales");
            System.out.println("4 - Monthly Salary");
            System.out.println("5 - Best Salesperson");
            System.out.println("6 - Monthly Turnover");
            System.out.println("7 - Total Salary Expenditure");

            System.out.print("Your Option: ");
            choice = sc.input.nextInt();
            sc.input.nextLine();

            switch (choice) {

                case 1:
                    sc.display();
                    break;

                case 2:
                    System.out.print("Search for salesperson: ");
                    sc.selectedName = sc.input.nextLine();

                    int position = sc.findSalesPerson(sc.selectedName);

                    if (position != -1) {
                        System.out.println(sc.selectedName
                                + " is found at " + (position + 1));
                    } else {
                        System.out.println("Salesperson not found.");
                    }
                    break;

                case 3:
                    System.out.print("Search for salesperson: ");
                    sc.selectedName = sc.input.nextLine();

                    if (sc.findSalesPerson(sc.selectedName) != -1) {
                        System.out.println("Total Sales for "
                                + sc.selectedName + ": "
                                + sc.calcTotalMonthlySales());
                    } else {
                        System.out.println("Salesperson not found.");
                    }
                    break;

                case 4:
                    System.out.print("Search for salesperson : ");
                    sc.selectedName = sc.input.nextLine();

                    if (sc.findSalesPerson(sc.selectedName) != -1) {
                        System.out.println("Monthly Salary for "
                                + sc.selectedName + ": R"
                                + sc.calcMonthlySalary());
                    } else {
                        System.out.println("Salesperson not found.");
                    }
                    break;

                case 5:
                    sc.getBestSalesPerson();
                    break;

                case 6:
                    System.out.println("Monthly Turnover "
                            + sc.calcMonthlyTurnOver());
                    break;

                case 7:
                    System.out.println("Salary Expenditure "
                            + sc.calcSalaryExpenditure());
                    break;

                default:
                    System.out.println("Invalid option.");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            answer = sc.input.nextLine();

        } while (answer.equalsIgnoreCase("Y"));

        System.out.println("Goodbye!");
        sc.input.close();
    }
}

