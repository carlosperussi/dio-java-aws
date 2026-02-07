package br.com.exercicios06.calc;

import java.util.stream.LongStream;

public enum Operation {
    SUM(n -> LongStream.of(n).reduce(0, Long::sum)), 
    SUBTRACTION(n -> LongStream.of(n).reduce(0, (n1, n2) -> n1 - n2));

    private final Calculate operationCallBack;

    Operation(final Calculate operationCallBack) {
        this.operationCallBack = operationCallBack;
    }

    public Calculate getOperationCallBack() {
        return operationCallBack;
    }
}
