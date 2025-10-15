package calculator;

import calculator.separator.SeparatorHandler;
import calculator.calculator.Calculator;
import calculator.message.MessageHelper;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        // TODO : 내일(10/16) 리팩토링 진행
        System.out.println(MessageHelper.INPUT_INTRO);
        String rawData = Console.readLine();

        SeparatorHandler separatorHandler = new SeparatorHandler(rawData);
        boolean correctSeperator = separatorHandler.validateCalcArea();

        if (!correctSeperator) throw new IllegalArgumentException();

        List<Long> numList = separatorHandler.splitNumberBySeparator();
        Long result = Calculator.run(numList);

        Console.close();
        System.out.println(MessageHelper.RESULT_HEADER + result);
    }
}
