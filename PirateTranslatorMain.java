import java.util.Scanner;
public class PirateTranslatorMain 
{
	public static void main(String[] args)
	{
		PirateTranslator translator = new PirateTranslator();
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		while (translator.getWordMeaning(word) == null){
			System.out.println("enter a new word please");
			translator.printDictionary();
			word = scanner.nextLine();
		}
		System.out.println(translator.getWordMeaning(word));
	}
}