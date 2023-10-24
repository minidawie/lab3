import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.*;

class containsEChecker implements StringChecker {
    public boolean checkString (String s) {
        if (s.contains("e") || s.contains("E")) {
            return true;
        }
        return false;
    }
}
public class ListTests {
    @Test
    public void testFilter(){
        containsEChecker check = new containsEChecker();

        List<String> input = new ArrayList<String>();
        input.add("onE");
        input.add("two");
        input.add("three");

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("onE");
        expectedOutput.add("three");

        assertArrayEquals(expectedOutput.toArray(), ListExamples.filter(input, check).toArray());
    }

    @Test
    public void testMerge(){
        List<String> input1 = new ArrayList<String>();
        input1.add("a");
        input1.add("b");
        input1.add("d");

        List<String> input2 = new ArrayList<String>();
        input2.add("c");
        input2.add("e");
        input2.add("f");

        List<String> output = new ArrayList<String>();
        output.add("a");
        output.add("b");
        output.add("c");
        output.add("d");
        output.add("e");
        output.add("f");

        assertArrayEquals(output.toArray(), ListExamples.merge(input1,input2).toArray());
    }
}
