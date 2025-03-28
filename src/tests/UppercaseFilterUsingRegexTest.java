package tests;

import main.UppercaseFilterUsingRegex;
import main.UppercaseFilterUsingRegex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppercaseFilterUsingRegexTest {

    @Test
    public void testFilterUppercaseUsingRegex() {

        String input = "VbAcMdfrOer ffDooE hhToooUawedRlloMwwA ppIhhhTfffAsfdU!";
        String expectedOutput = "VAMODETURMAITAU";
        assertEquals(expectedOutput, UppercaseFilterUsingRegex.filterUppercaseUsingRegex(input));

        input = "hhhwwwwddddaaaaaaa!";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingRegex.filterUppercaseUsingRegex(input));

        input = "VAMODETURMAITAU!";
        expectedOutput = "VAMODETURMAITAU";
        assertEquals(expectedOutput, UppercaseFilterUsingRegex.filterUppercaseUsingRegex(input));

        input = "";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingRegex.filterUppercaseUsingRegex(input));

        input = "1234!@#$";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingRegex.filterUppercaseUsingRegex(input));
    }
}