package ejercicio2;

import java.util.Collections;
import java.util.List;

public class Main {
	
	public static <T> List<T> invert(List<T> list) {
        Collections.reverse(list);
        return list;
    }

}
