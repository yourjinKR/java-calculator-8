package calculator.Gunbunja;


import java.util.Arrays;
import java.util.List;

public class SeparatorHandler {
    private final String basicSeparator = ",:";
    private String customSeparator = "";
    private String calcArea;

    public boolean validateGubunJa(String solution) {
        String customSeparator = solution.substring(0,5);
        return customSeparator.matches("^//.\\\\n");
    }

    public void splitByGubunJa(String solution) {
        String customSeparator = solution.substring(0, 5);
        String calcArea = solution.substring(5);

        this.customSeparator = customSeparator;
        this.calcArea = calcArea;
    }

    public boolean validateCalcArea() {
        return calcArea.matches("^[0-9" + basicSeparator + customSeparator + "]*$");
    }

    public List<Long> splitNumberByGubunJa() {
        String separator = basicSeparator + customSeparator;

        String[] numberList = calcArea.split("[" + separator + "]");
        return Arrays.stream(numberList).map(Long::parseLong).toList();
    }
}
