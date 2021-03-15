import java.util.Scanner;
public class PirateTranslatorMain {

	public static void main(String[] args) {
		PirateTranslator translator = new PirateTranslator();
		Scanner scanner = new Scanner(System.in);
		String word = "";
		printOptions();
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