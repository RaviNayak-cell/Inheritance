import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    private Worker w1;
    private Worker w2;

    @BeforeEach
    void setUp() {
         w1 = new Worker("000001", "ravi", "nayak","Mr.", 2003,25.00, 42);
         w2 = new Worker("000002", "lebron", "james","Mr.", 2000,30.00, 40);

    }

    @Test
    void setidNum() {
        w1.setidNum("000001");
        assertEquals("000001", w1.getidNum());
    }

    @Test
    void setFirstName() {
        w1.setFirstName("ravi");
        assertEquals("ravi", w1.getFirstName());
    }

    @Test
    void setLastName() {
        w1.setLastName("nayak");
        assertEquals("nayak", w1.getLastName());
    }

    @Test
    void setTitle() {
        w1.setTitle("Mr.");
        assertEquals("Mr.", w1.getTitle());
    }

    @Test
    void setYOB() {
        w1.setYOB(2003);
        assertEquals(2003, w1.getYOB());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1050.00, w1.calculateWeeklyPay(42), 0.01);
    }

    @Test
    void displayWeeklyPay() {
        assertEquals(1050.00, w1.displayWeeklyPay(42));
    }
}