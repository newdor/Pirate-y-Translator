//imports the scanner for input
import java.util.Scanner;

//creates the main class for the translator
public class PirateTranslatorMain {

	public static void main(String[] args) {
		
		//creates the new intake field
		PirateTranslator translator = new PirateTranslator();
		Scanner scanner = new Scanner(System.in);
		String word = "";
		
		//takes a single word input
		printOptions();
		int option = scanner.nextInt();
		scanner.nextLine();
		
		// start the game loop
		while (option!=2){
			System.out.println("Enter your text: ");
			word = scanner.nextLine();
			word = word.toLowerCase();
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
		System.out.print("Enter an option\n1: Enter your text\n2: End program\n");
	}

}
