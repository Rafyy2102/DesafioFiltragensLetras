package tests;

import main.UppercaseFilterUsingLoop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppercaseFilterUsingLoopTest {

    @Test
    public void testFilterUppercaseUsingLoop() {
        String input = "VbAcMdfrOer ffDooE hhToooUawedRlloMwwA ppIhhhTfffAsfdU!";
        String expectedOutput = "VAMODETURMAITAU";
        assertEquals(expectedOutput, UppercaseFilterUsingLoop.filterUppercaseUsingLoop(input));

        input = "hhhwwwwddddaaaaaaa!";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingLoop.filterUppercaseUsingLoop(input));

        input = "VAMODETURMAITAU!";
        expectedOutput = "VAMODETURMAITAU";
        assertEquals(expectedOutput, UppercaseFilterUsingLoop.filterUppercaseUsingLoop(input));

        input = "";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingLoop.filterUppercaseUsingLoop(input));

        input = "1234!@#$";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingLoop.filterUppercaseUsingLoop(input));
    }
}