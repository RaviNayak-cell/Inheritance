import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        Worker w1, w2, w3;
        SalaryWorker s1, s2, s3;
        ArrayList<Worker> workerList = new ArrayList<Worker>();

        workerList.add(new Worker("000001", "ravi", "nayak","Mr.", 2003,25.00, 40));
        workerList.add(new Worker("000002", "lebron", "james","Mr.", 2000,30.00, 50));
        workerList.add(new Worker("000003", "draymond", "green","Mr.", 1980,35.00, 40));
        workerList.add(new SalaryWorker("000004", "Tom", "Wulf", "Mr.", 1950, (200000 / (52 * 7 * 24)), 200000));
        workerList.add(new SalaryWorker("000005", "steph", "curry", "Mr.", 1995, (500000 / (52 * 7 * 24)), 500000));
        workerList.add(new SalaryWorker("000006", "dree", "brees", "Mr.", 1973, (1000000 / (52 * 7 * 24)), 1000000));

        for (Worker i : workerList) {
            System.out.println("Week 1");
            System.out.println(i.displayWeeklyPay(40));
        }


        for (Worker i : workerList) {
            System.out.println("Week 2");
            System.out.println(i.displayWeeklyPay(50));
        }


        for (Worker i : workerList) {
            System.out.println("Week 3");
            System.out.println(i.displayWeeklyPay(40));
        }
    }
}
