package fr.bge.testunit;

import org.junit.Assert;
import org.junit.Test;

public class TestBulletin {

	@Test
	public void testMentions() {
		
		Bulletin bulletin = new Bulletin();
		String mentionCalculee = bulletin.calculeMention(14);
		Assert.assertEquals("La mention doit �tre bien", Bulletin.MENTION_BIEN, mentionCalculee);
		mentionCalculee = bulletin.calculeMention(15);
		Assert.assertEquals("La mention doit �tre bien", Bulletin.MENTION_BIEN, mentionCalculee);
		mentionCalculee = bulletin.calculeMention(16);
		Assert.assertEquals("La mention doit �tre tr�s bien", "tr�s bien", mentionCalculee);
		
	}
	
}
