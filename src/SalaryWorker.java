public class SalaryWorker extends Worker{

    double annualSalary;

    public SalaryWorker(String idNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(idNum, firstName, lastName, title, YOB, hourlyPayRate, annualSalary);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return (annualSalary / 52);
    }

    @Override
    public String displayWeeklyPayRate(double hoursWorked)
    {
        System.out.println("Weekly Pay is a fraction of the Annual Salary: $" + String.format("%.2f", calculateWeeklyPay(hoursWorked)));
        return "";
    }


}
