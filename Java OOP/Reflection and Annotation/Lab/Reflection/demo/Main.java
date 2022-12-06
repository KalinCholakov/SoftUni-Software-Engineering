package reflection.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class personClass = Person.class;

        Constructor<Person> constructor = personClass.getDeclaredConstructor(String.class);

        constructor.setAccessible(true);

        Person pesho = constructor.newInstance("Pesho");

        Method method = personClass.getDeclaredMethod("run");

        method.setAccessible(true);

        method.invoke(pesho);

        System.out.println(Modifier.toString(method.getModifiers()));

        System.out.println(pesho.getName());
    }
}
