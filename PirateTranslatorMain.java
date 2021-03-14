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
			System.out.println("enter a word");
			word = scanner.nextLine();
			while (translator.getWordMeaning(word) == null){
				System.out.println("here are valid words: ");
				translator.printDictionary();
				System.out.println("Please enter a valid word: ");
				word = scanner.nextLine();
			}
			System.out.println(word+" means "+translator.getWordMeaning(word));
			System.out.println();
			printOptions();
			System.out.print("enter an option: ");
			option = scanner.nextInt();
			scanner.nextLine();
		}
	}

	// display options to user
	private static void printOptions(){
		System.out.print("1./user can enter a new word\n" +
						 "2./End program\n");
	}

}