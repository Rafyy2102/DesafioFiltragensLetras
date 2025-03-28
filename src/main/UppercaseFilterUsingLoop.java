package main;

public class UppercaseFilterUsingLoop {
    public static String filterUppercaseUsingLoop(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "VbAcMdfrOerSffDooEhhToooUawedRlloMwwAppIhhhTfffAsfdU!";
        System.out.println("Letras maiúsculas: " + filterUppercaseUsingLoop(input));
    }
}
