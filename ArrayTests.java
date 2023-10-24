import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 1,2,3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3,2,1 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 1,2 };
    assertArrayEquals(new int[]{ 2,1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest(){
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(new double[] {}), 0.0001);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(new double[] {1}), 0.0001);
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(new double[] {2,3}), 0.0001);
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(new double[] {1,1,3}), 0.0001);
  }
}


