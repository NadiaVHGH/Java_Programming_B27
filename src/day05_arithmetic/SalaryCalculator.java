package day05_arithmetic;

public class SalaryCalculator {

    public static void main(String[] args) {

        // add a main method
        //    declare and assign these variables:
        //
        //       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
        //
        //    Sample data:
        //       100000 (salary)
        //       0.08 (state tax rate)
        //       0.21 (federal tax rate)
        //
        //    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%
        //
        //    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes

        float salary = 160000;
        float stateTaxRate = 0.08F;
        float federalTaxRate = 0.21F;
        float stateTax = salary * stateTaxRate;
        float federalTax = salary * federalTaxRate;
        float totalTax = stateTax + federalTax;
        float salaryAfterTax = salary - totalTax;
        System.out.println("Salary calculator: " + " \n\n\tTotal Salary: $ " + salary +
                "\n\tState Tax Rate: " + " % " + "\n\tFederal Tax Rate: " + federalTax + "\n\tFederalTax: $"
                + totalTax + "\n\tSalary After Tax: $ " + salaryAfterTax);

    }
}
