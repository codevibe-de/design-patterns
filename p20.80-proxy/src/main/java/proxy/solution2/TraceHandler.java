package proxy.solution2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TraceHandler implements InvocationHandler {

    private final Object target;

    public TraceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] parameters) throws Throwable {
        System.out.println(">> " + method.getName() + " " + Arrays.toString(parameters));
        try {
            Object result;
            if (this.target instanceof InvocationHandler) {
                result = ((InvocationHandler) this.target).invoke(proxy, method, parameters);
            } else {
                result = method.invoke(this.target, parameters);
            }
            System.out.println("<< " + method.getName() + " " + Arrays.toString(parameters)
                    + " --> " + result);
            return result;
        } catch (final InvocationTargetException e) {
            throw e.getTargetException();
        }
    }

}
