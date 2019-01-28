package pers.fangjing.aop.test.handler;

import java.lang.reflect.InvocationHandler;

/**
 * Created by fang_j on 2019/01/25.
 */
public abstract class AbstractHandler implements InvocationHandler {
    private volatile Object targetObject;

    public Object getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }
}
