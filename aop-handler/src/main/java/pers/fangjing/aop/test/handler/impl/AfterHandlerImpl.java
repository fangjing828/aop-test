package pers.fangjing.aop.test.handler.impl;

import pers.fangjing.aop.test.handler.AfterHandler;

import java.lang.reflect.Method;

/**
 * Created by fang_j on 2019/01/25.
 */
public class AfterHandlerImpl extends AfterHandler {
    @Override
    public void handleAfter(Object proxy, Method method, Object[] args) {
        System.out.println("Handling after actual method execution ........");
    }
}
