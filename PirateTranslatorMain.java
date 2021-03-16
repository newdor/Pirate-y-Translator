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
		System.out.print("enter an option: ");
		int option = scanner.nextInt();
		scanner.nextLine();
		
		// start the game loop
		while (option!=2){
			System.out.println("enter your text: ");
			word = scanner.nextLine();
			System.out.println(translator.getTranslatedText(word));
			System.out.println();
			printOptions();
			System.out.print("enter an option: ");
			option = scanner.nextInt();
			scanner.nextLine();
		}
	}

	// display options to user
	private static void printOptions(){
		System.out.print("""
				1./user can enter a new word
				2./End program
				""");
	}

}
