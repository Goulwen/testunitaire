package fr.bge.palyndrome;

import org.junit.Assert;
import org.junit.Test;

public class TestPalyndrome {

	@Test
	public void testSimple() {
		Palyndrome pal = new Palyndrome();
		Assert.assertTrue(pal.isPalyndrome("KAYAK"));
		Assert.assertTrue(pal.isPalyndrome("ete"));
		Assert.assertTrue(pal.isPalyndrome("radar"));
		Assert.assertFalse(pal.isPalyndrome("test"));
		Assert.assertFalse(pal.isPalyndrome("vere"));
		Assert.assertTrue(pal.isPalyndrome("verrev"));
	}
	
}
