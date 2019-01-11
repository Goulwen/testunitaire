package fr.bge.testunit;

public class Bulletin {
	
	public static final String MENTION_BIEN = "bien";

	public String calculeMention(int note) {
		if(note == 20)
			return "Formidable";
		else if (note >=14 && note < 16)
			return MENTION_BIEN;
		else
			return "";
	}

}
