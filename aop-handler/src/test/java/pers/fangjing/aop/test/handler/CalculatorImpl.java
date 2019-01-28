package pers.fangjing.aop.test.handler;

/**
 * Created by fang_j on 2019/01/25.
 */
public class CalculatorImpl implements Calculator {

    public int calculate(int a, int b) {
        System.out.println("**********Actual Method Execution**********");
        return a/b;
    }
}
