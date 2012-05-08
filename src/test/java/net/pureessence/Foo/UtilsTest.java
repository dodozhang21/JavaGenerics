package net.pureessence.Foo;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class UtilsTest {
	@Test
	public void testGetList() {
		List<Dog> dogs = Utils.getList(Dog.class);
		Assert.assertEquals(Dog.POMERANIAN, dogs.get(0));
		Assert.assertEquals(Dog.WESTIE, dogs.get(1));
	}
}
