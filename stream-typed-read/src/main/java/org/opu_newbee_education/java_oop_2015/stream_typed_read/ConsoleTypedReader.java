package org.opu_newbee_education.java_oop_2015.stream_typed_read;

import javax.xml.bind.Binder;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by salterok on 01.10.2015.
 */
public final class ConsoleTypedReader {
    private static Map<Class, InputTypeBinder> readers = new HashMap<>();

    public static <TResult> TResult read(Class<TResult> type) throws InstantiationException, IllegalAccessException, TypedReadException {
        InputTypeBinder<TResult> binder = getOrCreateBinder(type);

        Scanner scanner = new Scanner(System.in);
        TResult result = binder.tryBind(scanner);
        if (result == null) {
            throw new TypedReadException(binder.getError());
        }
        return result;
    }

    private static <TResult> InputTypeBinder<TResult> getOrCreateBinder(Class<TResult> type) {
        InputTypeBinder binder = readers.getOrDefault(type, null);
        if (binder == null) {
            binder = new InputTypeBinder<TResult>(type);
            binder.prepare();
            readers.put(type, binder);
        }
        return binder;
    }
}
