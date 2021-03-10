
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class PirateTranslator {
	private int num;
	private HashMap<String,String> dictionary = new HashMap<>();

	public PirateTranslator(){
		loadRules();
	}

	public void loadRules() {
		//make sure the file can be opened
		try {
			File file = new File("pirate_phrases.txt");

			Scanner scan = new Scanner(file);

			num = scan.nextInt();
			scan.nextLine();


			for (int i = 0; i < num; i++) {
				String line = scan.nextLine();
				String[] sl = line.split(" ; ");
				dictionary.put(sl[0],sl[1]);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}

		System.out.println(dictionary);
	}

	public void printDictionary(){
		for (String word: dictionary.keySet()){
			System.out.println(word+" means "+dictionary.get(word));
		}
	}
}
