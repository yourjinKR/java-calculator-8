package calculator.calculator;

import calculator.WrappedNumList;

public class Calculator {
    public Calculator() {}

    public static Long sum(WrappedNumList wrappedNumList) {
        return wrappedNumList.getNumList().stream()
                .mapToLong(Long::longValue)
                .sum();
    }
}
