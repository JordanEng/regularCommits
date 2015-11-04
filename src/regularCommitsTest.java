import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class regularCommitsTest {
    private regularCommits a;

    @Before
    public void setup(){
        a = new regularCommits();
    }

    @Test
    public void testOne() {
        Assert.assertEquals("10", "1 2 5 10", a.oneNumber(10));
    }

    public void testTwo(){
        Assert.assertEquals("10, 15", 5, a.twoNumbers(10,15));
    }
}