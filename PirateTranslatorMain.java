import java.util.Scanner;
public class PirateTranslatorMain 
{
	public static void main(String[] args)
	{
		PirateTranslator translator = new PirateTranslator();
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		translator.getWordMeaning(word);
	}
}