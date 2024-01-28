import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker s1, s2;
    @BeforeEach
    void setUp() {
       s1 = (new SalaryWorker("000003", "Tom", "Wulf", "Mr.", 1950, (200000/(52*7*24)), 200000));
       s2 = (new SalaryWorker("000004", "Steph", "Curry", "Mr.", 1995, (500000/(52*7*24)), 500000));

    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(200000.0 / 52, s1.calculateWeeklyPay(40), 0.01);
    }

    @Test
    void displayWeeklyPay() {
        assertEquals(200000.0 / 52, s1.calculateWeeklyPay(40), 0.01);
    }

    @Test
    void setFirstName() {
        s1.setFirstName("tom");
        assertEquals("tom", s1.getFirstName());
    }

    @Test
    void setLastName() {
        s1.setLastName("wulf");
        assertEquals("wulf", s1.getLastName());
    }

    @Test
    void setTitle() {
        s1.setTitle("Mr.");
        assertEquals("Mr.", s1.getTitle());
    }

    @Test
    void setYOB() {
        s1.setYOB(1950);
        assertEquals(1950, s1.getYOB());
    }
}