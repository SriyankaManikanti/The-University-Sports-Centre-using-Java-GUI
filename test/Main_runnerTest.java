import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Main_runnerTest {
    Main_runner run1;
    public Main_runnerTest() {
    }
    @BeforeEach
    public void setUp() {
        run1 = new Main_runner();
    }
    @AfterEach
    public void tearDown() {
        run1 = null;
    }
    @Test
    public void testMain() {
        String name="Bhavesh";
        int a = run1.amount(name);
        assertEquals(500,a);
    }
}
