//imports the scanner for input
import java.util.Scanner;

//creates the main class for the translator
public class PirateTranslatorMain {

	public static void main(String[] args) {
		
		//creates the new intake field
		PirateTranslator translator = new PirateTranslator();
		Scanner scanner = new Scanner(System.in);
		String word = "";
		printOptions();
		
		//takes a single word input
		System.out.print("Enter an option: ");
		int option = scanner.nextInt();
		scanner.nextLine();
		
		// start the game loop
		while (option!=2){
			System.out.println("Enter your text: ");
			word = scanner.nextLine();
			System.out.println(translator.getTranslatedText(word));
			System.out.println();
			printOptions();
			System.out.print("Enter an option: ");
			option = scanner.nextInt();
			scanner.nextLine();
		}
	}

	// display options to user
	private static void printOptions(){
		System.out.print("""
				1./Enter a new word:
				2./End program
				""");
	}

}
