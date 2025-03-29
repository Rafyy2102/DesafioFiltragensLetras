package tests;

import main.ListCharacters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ListCharactersTest {

    @Test
    public void testGetUpperCaseLetters() {

        String inputString = "VbAcMdfrOerSffDooEhhToooUawedRlloMwwAppIhhhTfffAsfdU!";

        List<Character> result = ListCharacters.getUpperCaseLetters(inputString);

        List<Character> expected = Arrays.asList('V', 'A', 'M', 'O', 'S', 'D', 'E', 'T', 'U', 'R', 'M', 'A', 'I', 'T', 'A', 'U');

        assertEquals(expected, result);
    }
}