package pers.fangjing.aop.test.handler;

import java.lang.reflect.Proxy;
import java.util.List;

/**
 * Created by fang_j on 2019/01/25.
 */
public class ProxyFactory {
    private static final ProxyFactory INSTANCE = new ProxyFactory();

    public static Object getProxy(Object targetObject, List<AbstractHandler> handlers) {
        return INSTANCE.getProxyInternal(targetObject, handlers);
    }


    Object getProxyInternal(Object targetObject, List<AbstractHandler> handlers) {
        if (handlers.isEmpty()) {
            return targetObject;
        }

        Object proxyObject = targetObject;

        for (AbstractHandler handler : handlers) {
            handler.setTargetObject(proxyObject);
            proxyObject = Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), handler);
        }

        return proxyObject;
    }
}
