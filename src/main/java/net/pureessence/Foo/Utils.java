package net.pureessence.Foo;

import java.util.Arrays;
import java.util.List;

public class Utils {
	@SuppressWarnings("rawtypes")
	public static <T extends Enum> List<T> getList(Class<T> clazz) {
	    return Arrays.asList(clazz.getEnumConstants());
	}
}
