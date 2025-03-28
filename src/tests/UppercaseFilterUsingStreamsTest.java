package tests;

import main.UppercaseFilterUsingStreams;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppercaseFilterUsingStreamsTest {

    @Test
    public void testFilterUppercaseUsingStream() {

        String input = "VbAcMdfrOer ffDooE hhToooUawedRlloMwwA ppIhhhTfffAsfdU!";
        String expectedOutput = "VAMODETURMAITAU";
        assertEquals(expectedOutput, UppercaseFilterUsingStreams.filterUppercaseUsingStream(input));

        input = "hhhwwwwddddaaaaaaa!";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingStreams.filterUppercaseUsingStream(input));

        input = "VAMODETURMAITAU!";
        expectedOutput = "VAMODETURMAITAU";
        assertEquals(expectedOutput, UppercaseFilterUsingStreams.filterUppercaseUsingStream(input));

        input = "";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingStreams.filterUppercaseUsingStream(input));

        input = "1234!@#$";
        expectedOutput = "";
        assertEquals(expectedOutput, UppercaseFilterUsingStreams.filterUppercaseUsingStream(input));
    }
}