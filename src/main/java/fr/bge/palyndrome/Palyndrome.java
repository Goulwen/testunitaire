package fr.bge.palyndrome;

public class Palyndrome {

	public boolean isPalyndrome(String chaine) {
		StringBuffer stringBuffer = new StringBuffer(chaine);
		stringBuffer.reverse();
		String chaineInverse = stringBuffer.toString();
		return chaineInverse.equalsIgnoreCase(chaine);
	}
	
}
