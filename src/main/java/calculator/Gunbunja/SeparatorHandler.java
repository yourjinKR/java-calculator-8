package calculator.Gunbunja;


public class SeparatorHandler {
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
        return calcArea.matches("^[0-9,:" + customSeparator + "]*$");
    }
}
