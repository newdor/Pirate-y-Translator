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


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class pirateTranslator {
	private TranslationRule[] rules;
	private int num;
	
	private void loadRules()
	{
		//make sure the file can be opened
		try
		{
			File file = new File("pirate_phrases.txt");
			
			Scanner scan = new Scanner(file);
			
			num = scan.nextInt();
			scan.nextLine();
		
			rules = new TranslationRule[num];
		
			for(int i = 0; i < num; i++)
			{
				String line = scan.nextLine();
				String[] sl = line.split(" ; ");
				rules[i] = new TranslationRule(sl[0], sl[1]);
			}
						
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			return;
		}
				
	}
	
	public pirateTranslator()
	{
		loadRules();
	}
	
		
	public String translate(String s)
	{
		String[] words = s.split("[\\.!?\"]+");
		StringBuilder result = new StringBuilder();
		String finalString = "";
		String letter;
		int count = 0;
		
		for(int j = 0; j < words.length; j++)
		{
			count += words[j].length();
			//test the first letter of the first word of the user input
			if(j == 0)
			{
				//see if the first word of the string is capitalized and translate
				if(words[j].charAt(0) >= 'A' && words[j].charAt(0) <= 'Z')
				{
					letter = words[j].substring(0, 1).toLowerCase();
								
					words[j] = letter + words[j].substring(1);
												
					for(int i = 0; i < rules.length; i++)
					{
						String e = rules[i].getEnglish();
						String p = rules[i].getPirate();
						words[j] = words[j].replaceAll("\\b" + e + "\\b", p);
					}
				
					letter = words[j].substring(0, 1);
					result.append(letter.toUpperCase());
					result.append(words[j].substring(1));
					if (j == words.length-1)
						result.append(s.substring(count));
					else
						result.append(s.substring(count, count + 1));
				}
				//if the first word is not capitalized
				else
				{
					for(int i = 0; i < rules.length; i++)
					{
						String e = rules[i].getEnglish();
						String p = rules[i].getPirate();
						words[j] = words[j].replaceAll("\\b" + e + "\\b", p);
					}
					result.append(words[j]);
					if (j == words.length-1)
						result.append(s.substring(count));
					else
						result.append(s.substring(count, count + 1));
				
				}
			}
			//test the first letter of the rest of the strings in the array
			//to see if it is capitalized and translate
			else
			{
				//see if the first word of the string is capitalized and translate
				if(words[j].charAt(1) >= 'A' && words[j].charAt(1) <= 'Z')
				{
						letter = words[j].substring(1, 2).toLowerCase();
				
						words[j] = words[j].substring(0, 1) + letter + 
							words[j].substring(2);
												
						for(int i = 0; i < rules.length; i++)
						{
							String e = rules[i].getEnglish();
							String p = rules[i].getPirate();
							words[j] = words[j].replaceAll("\\b" + e + "\\b", p);
						}
				
						letter = words[j].substring(1, 2);
						result.append(words[j].substring(0, 1));
						result.append(letter.toUpperCase());
						result.append(words[j].substring(2));
						if (j == words.length-1)
							result.append(s.substring(count));
						else
							result.append(s.substring(count, count + 1));
				}
				//if the first word is not capitalized
				else
				{
					for(int i = 0; i < rules.length; i++)
					{
						String e = rules[i].getEnglish();
						String p = rules[i].getPirate();
						words[j] = words[j].replaceAll("\\b" + e + "\\b", p);
					}
					result.append(words[j]);
					if (j == words.length-1)
						result.append(s.substring(count));
					else
						result.append(s.substring(count, count + 1));
				}
			}
			
			count++;
			finalString = result.toString();
		}
		return finalString;
	}
	
	public void runInteraction()
	{
		String line;
		String pLine;
		
		pirateTranslator pt = new pirateTranslator();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a phrase.");
		line = keyboard.nextLine();
		
		pLine = pt.translate(line);
		
		System.out.println(pLine);
	}
}
