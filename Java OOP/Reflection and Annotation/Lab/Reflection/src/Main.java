import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;

        //Class<?> reflection = Class.forName("Reflection");

        //Constructor<?>[] constructors = clazz.getConstructors();

        System.out.println(clazz);

        //System.out.println(clazz.getName());

        //System.out.println(clazz.getSimpleName());

        System.out.println(clazz.getSuperclass());

        //Class<? super Reflection> superclass = clazz.getSuperclass();

        //Class<?>[] interfaces = clazz.getInterfaces();

        Arrays.stream(clazz.getInterfaces())
                .forEach(System.out::println);

        Constructor<Reflection> ctor = clazz.getDeclaredConstructor();

        Reflection reflection = ctor.newInstance();

        System.out.println(reflection);
    }
}
