package main;

import java.util.ArrayList;
import java.util.List;

public class ListCharacters {

    public static List<Character> getUpperCaseLetters(String input) {

        List<Character> upperCaseLetters = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char palavra = input.charAt(i);

            if (Character.isUpperCase(palavra)) {
                upperCaseLetters.add(palavra);
            }
        }
        return upperCaseLetters;
    }

    public static void main(String[] args) {

        String letras = "VbAcMdfrOerSffDooEhhToooUawedRlloMwwAppIhhhTfffAsfdU!";
        List<Character> upperCaseLetters = getUpperCaseLetters(letras);

        System.out.println("Letras maiúsculas: " + upperCaseLetters);
    }
}