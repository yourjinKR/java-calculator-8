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
            this.customSeparator = getCustomSeparator(solution);
            this.calcArea = cutCustomSeperator(solution);
            return;
        }

        this.calcArea = solution;
    }

    public boolean validateCustomSeparator(String solution) {
        if (solution.length() < 5) return false;

        String customSeparator = solution.substring(0,5);
        return customSeparator.matches("^//.\\\\n");
    }

    public String cutCustomSeperator(String solution) {
        return solution.substring(5);
    }

    public String getCustomSeparator(String solution) {
        char pureCustomSeparator = solution.charAt(2);
        return String.valueOf(pureCustomSeparator);
    }

    public boolean validateCalcArea() {
        return calcArea.matches("^[0-9" + basicSeparator + customSeparator + "]*$");
    }

    public List<Long> splitNumberBySeparator() {
        if (!validateCalcArea())
            throw new IllegalArgumentException();

        String separator = basicSeparator + customSeparator;

        String[] numberList = calcArea.split("[" + separator + "]");
        return Arrays.stream(numberList).map(this::parseLong).toList();
    }

    public Long parseLong(String stringMember) {
        try {
            return Long.parseLong(stringMember);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
