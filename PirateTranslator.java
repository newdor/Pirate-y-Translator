import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class PirateTranslator {
	private int num;
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

			num = scan.nextInt();
			scan.nextLine();

			for (int i = 0; i < num; i++) {
				String line = scan.nextLine();
				String[] sl = line.split(" ; ");
				dictionary.put(sl[0], sl[1]);
			}
			scan.close();// suggested by Eclipse

		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}

		// System.out.println(dictionary);
	}

	// display dictionary
	public void printDictionary(){
		for (String word: dictionary.keySet()){
			System.out.println(word);
		}
	}

	// get the word meaning
	public String getWordMeaning(String word){
		if (!dictionary.containsKey(word)){
			return null;
		}
		return dictionary.get(word);
	}

//for captainHook translator
	public HashMap<String, String> getDictionary() {
		return dictionary;
	}
}
