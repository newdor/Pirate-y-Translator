import java.util.Map;
import java.util.Scanner;

public class TextTranslatorMain {
	public static void alternateMain(String[] args) {
//add the whole text input into a String variable
		Scanner keyboard = new Scanner(System.in);
		String englishText = keyboard.next();
//for every English word in the dictionary check the text and replace the word with pirate-y word

		PirateTranslator captainHook = new PirateTranslator();
		for (Map.Entry<String,String> entry : captainHook.getDictionary().entrySet()) {//using map.entrySet() for iteration
			englishText = englishText.replaceAll(entry.getKey(), entry.getValue());
		}
		System.out.println(englishText);
		keyboard.close(); // suggested by Eclipse for security
	}

}
