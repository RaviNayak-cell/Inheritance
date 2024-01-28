import java.util.Calendar;
public class Worker extends Person
{

    private double hourlyPayRate;

    public Worker(String idNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double hoursWorked) {
        super(idNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double overtime = 0;
        double normal = 0;
        if (hoursWorked > 40)
        {
            overtime = (hoursWorked - 40) * (hourlyPayRate * 1.0);
            hoursWorked = 40;
            normal = hoursWorked * hourlyPayRate;
            return overtime + normal;
        } else
        {
            normal = hoursWorked * hourlyPayRate;
            return normal;
        }
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        if (hoursWorked > 40)
        {
            System.out.println("Hours of normal Pay: 40.0");
            System.out.println("Total normal Pay: $" + 40 * hourlyPayRate);
            System.out.println("Hours of Overtime Pay: " + (hoursWorked - 40));
            System.out.println("Total Overtime Pay: $" + (hoursWorked - 40) * (hourlyPayRate * 1.0));
            System.out.println("Total Pay: $" + calculateWeeklyPay(hoursWorked));
        } else
        {
            System.out.println("Hours of normal pay: " + hoursWorked);
            System.out.println("Total Pay: $" + calculateWeeklyPay(hoursWorked));
        }
        return "";
    }

}
