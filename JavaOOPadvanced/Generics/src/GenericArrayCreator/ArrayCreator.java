package GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by 200sx on 3/26/2017.
 */
public class ArrayCreator<T> {

    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) new Object[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }

        return array;
    }

    public static <T> T[] create(Class<T> inputClass, int length, T item) {
        T[] array = (T[]) Array.newInstance(inputClass, length);

        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }

        return array;
    }
}
