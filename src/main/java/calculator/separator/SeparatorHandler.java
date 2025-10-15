package calculator.separator;


import java.util.Arrays;
import java.util.List;

public class SeparatorHandler {
    private final String basicSeparator = ",:";
    private String customSeparator = "";
    private String calcArea;

    public SeparatorHandler() {}

    public SeparatorHandler(String solution) {
        boolean hasCustom = this.validateCustomSeparator(solution);
        if (hasCustom) {
            splitByCustomSeparator(solution);
            return;
        }

        this.calcArea = solution;
    }

    public boolean validateCustomSeparator(String solution) {
        if (solution.length() < 5) return false;

        String customSeparator = solution.substring(0,5);
        return customSeparator.matches("^//.\\\\n");
    }

    public void splitByCustomSeparator(String solution) {
        char customSeparator = solution.charAt(2);
        String calcArea = solution.substring(5);

        this.customSeparator = String.valueOf(customSeparator);
        this.calcArea = calcArea;
    }

    public boolean validateCalcArea() {
        return calcArea.matches("^[0-9" + basicSeparator + customSeparator + "]*$");
    }

    public List<Long> splitNumberBySeparator() {
        String separator = basicSeparator + customSeparator;

        String[] numberList = calcArea.split("[" + separator + "]");
        return Arrays.stream(numberList).map(Long::parseLong).toList();
    }
}
