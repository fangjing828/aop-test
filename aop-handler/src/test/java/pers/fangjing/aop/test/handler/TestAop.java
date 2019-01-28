package pers.fangjing.aop.test.handler;

import com.google.common.collect.Lists;
import pers.fangjing.aop.test.handler.impl.AfterHandlerImpl;
import pers.fangjing.aop.test.handler.impl.BeforeHandlerImpl;

import java.util.List;

/**
 * Created by fang_j on 2019/01/25.
 */
public class TestAop {

    public static void main(String[] args) {
        CalculatorImpl calcImpl = new CalculatorImpl();
        List<AbstractHandler> handlers = Lists.newArrayList(new BeforeHandlerImpl(), new AfterHandlerImpl(), new BeforeHandlerImpl());
        Calculator proxy = (Calculator) ProxyFactory.getProxy(calcImpl,
                handlers);
        int result = proxy.calculate(20, 10);
        System.out.println("Final Result :::" + result);
    }
}
