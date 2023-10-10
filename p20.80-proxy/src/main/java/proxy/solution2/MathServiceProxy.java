package proxy.solution2;

import proxy.MathService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MathServiceProxy implements MathService {

    private final InvocationHandler handler;

    public MathServiceProxy(InvocationHandler handler) {
        this.handler = handler;
    }

    @Override
    public int sum(int x, int y) {
        try {
            final Method method = MathService.class.getMethod("sum", int.class, int.class);
            final Object result = this.handler.invoke(this, method, new Object[]{x, y});
            return (Integer) result;
        } catch (final Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int diff(int x, int y) {
        try {
            final Method method = MathService.class.getMethod("diff", int.class, int.class);
            final Object result = this.handler.invoke(this, method, new Object[]{x, y});
            return (Integer) result;
        } catch (final Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
