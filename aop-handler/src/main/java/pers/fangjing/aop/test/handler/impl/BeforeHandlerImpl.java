package pers.fangjing.aop.test.handler.impl;

import pers.fangjing.aop.test.handler.BeforeHandler;

import java.lang.reflect.Method;

/**
 * Created by fang_j on 2019/01/25.
 */
public class BeforeHandlerImpl extends BeforeHandler {
    @Override
    public void handleBefore(Object proxy, Method method, Object[] args) {
        System.out.println("Handling before actual method execution ........");
    }
}
