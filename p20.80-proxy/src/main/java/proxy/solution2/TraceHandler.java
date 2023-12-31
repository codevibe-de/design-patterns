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
        // before invoke
        System.out.println(">> " + method.getName() + " " + Arrays.toString(parameters));

        // invoke
        Object result;
        try {
            if (this.target instanceof InvocationHandler) {
                result = ((InvocationHandler) this.target).invoke(proxy, method, parameters);
            } else {
                result = method.invoke(this.target, parameters);
            }
        } catch (final InvocationTargetException e) {
            throw e.getTargetException();
        }

        // after invoke
        System.out.println("<< " + method.getName() + " " + Arrays.toString(parameters)
                + " --> " + result);
        return result;
    }

}
