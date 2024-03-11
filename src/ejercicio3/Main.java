package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static <T> List<T> convert(T[] array) {
		List<T> list = new ArrayList<>(array.length);
		for (T element : array) {
			list.add(element);
		}
		return list;

	}
}
