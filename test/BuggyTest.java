import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class BuggyTest {

  @Test
  public void testSummation() {
    assertEquals(10, Buggy.summation(4));
  }

  @Test
  public void testFactorial_v1() {
    assertEquals(24, Buggy.factorial_v1(4));
  }

  @Test
  public void testFactorial_v2_a() {
    assertEquals(1, Buggy.factorial_v2(1));
  }

  // This test enters an infinite loop.
  // Don't add the @Test until you are ready to debug it.
  public void testFactorial_v2_b() {
    assertEquals(24, Buggy.factorial_v2(4));
  }

}