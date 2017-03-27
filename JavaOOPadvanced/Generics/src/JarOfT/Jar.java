package JarOfT;

import java.util.ArrayDeque;


/**
 * Created by 200sx on 3/26/2017.
 */
public class Jar<T> {
    private ArrayDeque<T> elements;

    public Jar(){
        this.elements = new ArrayDeque<T>();
    }

    public void add(T element){
        this.elements.push(element);
    }

    public T remove(){
            return this.elements.pop();
    }
}
