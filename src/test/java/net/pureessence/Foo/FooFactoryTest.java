package net.pureessence.Foo;

import junit.framework.Assert;

import org.junit.Test;

public class FooFactoryTest {
	@Test
	public void testFooFactory() {
		Foo foo = FooFactory.getFoo(2011);
		Assert.assertEquals(Foo.class, foo.getClass());

		Foo foo2013 = FooFactory.getFoo(2013);
//		foo2013.getAge();
		Assert.assertEquals(Foo2013.class, foo2013.getClass());
	}
}
