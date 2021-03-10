//Name: Rachael Devlaeminck
//  Assignment: Lab 02
//  Title: Pirate Translator
//  Course: CSCE 270
//  Lab Section: Section 01
//  Semester: Fall 2010
//  Instructor: David Wolff
//  Date: 9/21/10
//  Sources consulted: None
//  Program description: translates what the use types into pirate
//  Known Bugs: None
//  Creativity: maintaining capitalization through translation using StringBuilder

public class TranslationRule {
	private String english;
	private String pirate;
	
	public TranslationRule(String e, String p)
	{
		english = e;
		pirate = p;
	}

	public String getEnglish()
	{
		return english;
	}
	
	public String getPirate()
	{
		return pirate;
	}
	
	public void setEnglish(String newE)
	{
		english = newE;
	}
	
	public void setPirate(String newP)
	{
		pirate = newP;
	}
	
	public String applyRule(String english)
	{
		return pirate;
	}
	
}
