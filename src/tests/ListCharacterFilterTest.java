package tests;
import main.ListCharacterFilter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ListCharacterFilterTest {

    @Test
    public void testFilterUpperCase() {

        List<Character> input = Arrays.asList('V', 'b', 'A', 'c', 'M', 'd', 'f', 'r', 'O', 'e', 'r', 'S', 'f', 'f', 'D', 'o', 'o', 'E', 'h', 'h', 'T', 'o', 'o', 'U', 'a', 'w', 'e', 'd', 'R', 'l', 'l', 'o', 'M', 'w', 'w', 'A', 'p', 'p', 'I', 'h', 'h', 'T', 'f', 'f', 'A', 's', 'f', 'd', 'U');
        List<Character> expectedOutput = ListCharacterFilter.filterUpperCase(input);
        List<Character> expected = Arrays.asList('V', 'A', 'M', 'O', 'S', 'D', 'E', 'T', 'U', 'R', 'M', 'A', 'I', 'T', 'A', 'U');
        assertEquals(expected, expectedOutput);
    }
}