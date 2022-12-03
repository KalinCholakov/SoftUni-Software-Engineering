import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<Reflection> clazz = Reflection.class;

        //Class<?> reflection = Class.forName("Reflection");

        //Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        //System.out.println(clazz);

        //System.out.println(clazz.getName());

        //System.out.println(clazz.getSimpleName());

        //System.out.println(clazz.getSuperclass());

        //Class<? super Reflection> superclass = clazz.getSuperclass();

        //Class<?>[] interfaces = clazz.getInterfaces();

        /*Arrays.stream(clazz.getInterfaces())
                .forEach(System.out::println);

        Constructor<Reflection> ctor = clazz.getDeclaredConstructor();

        Reflection reflection = ctor.newInstance();

        System.out.println(reflection);*/

        //static field
        /*Field nickName = clazz.getDeclaredField("nickName");

        nickName.setAccessible(true);

        System.out.println(nickName.get(null));

        Reflection reflection = new Reflection();*/

        //instance field
        /*Field email = clazz.getDeclaredField("email");

        email.setAccessible(true);

        System.out.println(email.get(reflection));

        email.set(reflection, "pesho@gmail.com");

        System.out.println(email.get(reflection));*/

        Method[] methods = clazz.getDeclaredMethods();

        Comparator<Method> comparator = Comparator.comparing(Method::getName);

        Set<Method> getters = new TreeSet<>(comparator);
        Set<Method> setters = new TreeSet<>(comparator);

        for (Method method : methods) {
            String methodName = method.getName();

            if (methodName.contains("get")) {
                getters.add(method);
            } else if (methodName.contains("set")) {
                setters.add(method);
            }
        }

        for (Method getter : getters) {
            System.out.println(getter.getName() + " will return class " + getter.getReturnType().getName());
        }

        for (Method setter : setters) {
            System.out.println(setter.getName() + " and will set field of class " + setter.getParameterTypes()[0].getName());
        }
    }
}
