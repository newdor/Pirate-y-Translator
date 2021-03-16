//imports the program necessary to retrieve data from txt file
//allows for hashmap
//allows for scanner
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

//creates hashmap to access the dictionary
//loads the rules method
public class PirateTranslator {
	private HashMap<String, String> dictionary;

	public PirateTranslator() {
		dictionary = new HashMap<>();
		loadRules();
	}

	// load all words and their meanings into the dictionary
	public void loadRules() {
		// make sure the file can be opened
		try {
			File file = new File("pirate_phrases.txt");

			Scanner scan = new Scanner(file);

			//instructs that text input is split by semi-colon with stirng as
			//element 0 is the english string, element 1 is the pirate jargon
			while (scan.hasNextLine()){
				String line = scan.nextLine();
				String[] sl = line.split(" ; ");
				dictionary.put(sl[0], sl[1]);
			}

			//closes the scanner
			scan.close();

		}
		
		//if file is not found, return message and stop
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}

		//to test working dictionary, print entries
		// System.out.println(dictionary);
	}

	//creates a loop to match the user input (stored as array) to the single dictionary elements
	public String getTranslatedText(String words){
		//splits the string around recognized portions
		String [] wordArr = words.split(" ");
		String res = "";
		for (int i = 0; i<wordArr.length;i++){
			res+=getWordMeaning(wordArr[i])+" ";
		}
		//takes spaces before and after away
		return res.strip();
	}

	// display dictionary
	public void printDictionary(){
		for (String word: dictionary.keySet()){
			System.out.println(word);
		}
	}

	//if word meaning is not in the dictionary, return the original english word
	public String getWordMeaning(String word){
		if (!dictionary.containsKey(word)){
			return word;
		}
		//@return original english word 
		return dictionary.get(word);
	}

//for captainHook translator
	public HashMap<String, String> getDictionary() {
		return dictionary;
	}
}
