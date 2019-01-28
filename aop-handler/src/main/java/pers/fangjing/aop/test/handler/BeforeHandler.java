package pers.fangjing.aop.test.handler;


import java.lang.reflect.Method;

/**
 * Created by fang_j on 2019/01/25.
 */
public abstract class BeforeHandler extends AbstractHandler {
    public abstract void handleBefore(Object proxy, Method method, Object[] args);

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        handleBefore(proxy, method, args);
        return method.invoke(getTargetObject(), args);
    }
}
