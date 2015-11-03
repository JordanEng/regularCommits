import org.junit.Test;
import static org.junit.Assert.*;

public class regularCommitsTest {
    @Test
    public void testOne() {
        regularCommits a = new regularCommits();
        assertEquals("1 2 5 10", a.oneNumber(10));
    }

    public void testTwo(){
        regularCommits a = new regularCommits();
        assertEquals(5, a.twoNumbers(10,15));
    }
}