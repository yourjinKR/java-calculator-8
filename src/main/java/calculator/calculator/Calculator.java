package calculator.calculator;

import java.util.List;

public class Calculator {
    public Calculator() {}

    public static Long sum(List<Long> numList) {
        return numList.stream()
                .mapToLong(Long::longValue)
                .sum();
    }
}
