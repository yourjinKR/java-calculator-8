package calculator.Gunbunja;


public class SeparatorHandler {

    public boolean validateGubunJa(String solution) {
        String customSeparator = solution.substring(0,5);
        return customSeparator.matches("^//.\\\\n");
    }


}
