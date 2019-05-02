package at.ac.wu.nm.ansible.syntax.chain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.stream.Stream;

public class ChainingHandler implements InvocationHandler {

  @SuppressWarnings("unchecked")
  public static <T, S extends T> S simpleProxy(T target, Class<? extends T> iface, Class<?>...otherIfaces) {
    Class<?>[] allInterfaces = Stream.concat(
        Stream.of(iface),
        Stream.of(otherIfaces))
        .distinct()
        .toArray(Class<?>[]::new);

    return (S) Proxy.newProxyInstance(iface.getClassLoader(),
        allInterfaces,
        new ChainingHandler(target));
  }

  private final Object target;

  public ChainingHandler(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println(">>>handled<<<");
    method.invoke(target, args);
    return proxy;
  }
}
