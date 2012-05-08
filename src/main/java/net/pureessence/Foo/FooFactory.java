package net.pureessence.Foo;

public class FooFactory {
	@SuppressWarnings("unchecked")
	public static <F extends Foo> F getFoo(int year) {
		try {
			if (year >= 2013) {
				return (F) Foo2013.class.newInstance();
			} else {
				return (F) Foo.class.newInstance();
			}
		} catch (InstantiationException e) {
			// TODO
		} catch (IllegalAccessException e) {
			// TODO
		}
		return null;
	}
}
