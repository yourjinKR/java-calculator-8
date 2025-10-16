package calculator;

import calculator.separator.SeparatorHandler;
import calculator.calculator.Calculator;
import calculator.message.MessageHelper;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println(MessageHelper.INPUT_INTRO);
        String rawData = Console.readLine();

        SeparatorHandler separatorHandler = new SeparatorHandler(rawData);

        List<Long> numList = separatorHandler.splitNumberBySeparator();
        Long result = Calculator.sum(numList);

        Console.close();
        System.out.println(MessageHelper.RESULT_HEADER + result);
    }
}
