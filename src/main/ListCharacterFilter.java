package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListCharacterFilter {

    public static List<Character> filterUpperCase(List<Character> input) {
        return input.stream()
                .filter(Character::isUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Character> input = Arrays.asList('V', 'b', 'A', 'c', 'M', 'd', 'f', 'r', 'O', 'e', 'r', 'S', 'f', 'f', 'D', 'o', 'o', 'E', 'h', 'h', 'T', 'o', 'o', 'U', 'a', 'w', 'e', 'd', 'R', 'l', 'l', 'o', 'M', 'w', 'w', 'A', 'p', 'p', 'I', 'h', 'h', 'T', 'f', 'f', 'A', 's', 'f', 'd', 'U');
        List<Character> letras = filterUpperCase(input);
        System.out.println("Letras maiúsculas: " + letras);
    }
}