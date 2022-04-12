public class App {
    public static void main(String[] args) throws Exception {

        double grossSalary = 10000;
        double incomeTax = 1000;
        double providentFund = 900;
        double professionalTax = 500;
        double netSalary = grossSalary - (incomeTax + providentFund + professionalTax);

        System.out.println("Net Salary is " + netSalary);


    }
}
