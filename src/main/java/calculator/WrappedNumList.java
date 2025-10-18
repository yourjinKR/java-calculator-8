package calculator;

import java.util.List;

public class WrappedNumList {
    private final List<Long> numList;

    public WrappedNumList(List<Long> numList) {
        this.numList = numList;
    }

    public List<Long> getNumList() {
        return numList;
    }
}
