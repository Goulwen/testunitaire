package fr.bge.anneeBi;

import org.junit.Assert;
import org.junit.Test;

public class TestAnneeBi {

	@Test
	public void testSimple() {
		AnneeBi pal = new AnneeBi();
		Assert.assertTrue(pal.isAnneeBi(1984));
		Assert.assertTrue(pal.isAnneeBi(2000));
		Assert.assertFalse(pal.isAnneeBi(2100));
		Assert.assertFalse(pal.isAnneeBi(1943));
	}
	
}
