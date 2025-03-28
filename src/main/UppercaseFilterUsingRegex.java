package main;

public class UppercaseFilterUsingRegex {
    public static String filterUppercaseUsingRegex(String input) {
        return input.replaceAll("[^A-Z]", "");
    }

    public static void main(String[] args) {
        String input = "VbAcMdfrOerSffDooEhhToooUawedRlloMwwAppIhhhTfffAsfdU!";
        System.out.println("Letras maiúsculas: " + filterUppercaseUsingRegex(input));
    }
}
