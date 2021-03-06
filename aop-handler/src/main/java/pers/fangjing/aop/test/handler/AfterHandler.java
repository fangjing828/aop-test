package pers.fangjing.aop.test.handler;

import java.lang.reflect.Method;

/**
 * Created by fang_j on 2019/01/25.
 */
public abstract class AfterHandler extends AbstractHandler {
    public abstract void handleAfter(Object proxy, Method method, Object[] args);

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(getTargetObject(), args);
        handleAfter(proxy, method, args);
        return result;
    }
}
