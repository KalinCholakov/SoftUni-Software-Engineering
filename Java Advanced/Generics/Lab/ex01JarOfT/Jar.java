package generics.lab.ex01JarOfT;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> content;

    public Jar() {
        this.content = new ArrayDeque<>();
    }

    public void add(T element) {
        this.content.push(element);
    }

    public T remove() {
         return this.content.pop();
    }
}
