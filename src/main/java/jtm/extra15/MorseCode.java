package jtm.extra15;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MorseCode {

	/*
	 * TODO
	 * 
	 * Implement function that translates given text to morse code Morse code
	 * encodings can be found in MorseLetters.txt Add one empty space after each
	 * morse letter so that it would be easier to see where one ends and the next
	 * one starts Replace empty spaces with straight line symbol: |
	 * 
	 * Example: Thank you very much - .... .- -. -.- | -.-- --- ..- | ...- . .-.
	 * -.-- | -- ..- -.-. ....
	 * 
	 * Note that morse code does not have capitalization e.g. T and t are both the
	 * same in morse code: '-'
	 * 
	 */
	@SuppressWarnings("unlikely-arg-type")
	public static String translateToMorse(String text) {
		HashMap<String, String> morseCode = new HashMap<String, String>();
		morseCode.put("a", ".-");
		morseCode.put("b", "-...");
		morseCode.put("c", "-.-.");
		morseCode.put("d", "-..");
		morseCode.put("e", ".");
		morseCode.put("f", "..-.");
		morseCode.put("g", "--.");
		morseCode.put("h", "....");
		morseCode.put("i", "..");
		morseCode.put("j", ".---");
		morseCode.put("k", "-.-");
		morseCode.put("l", ".-..");
		morseCode.put("m", "--");
		morseCode.put("n", "-.");
		morseCode.put("o", "---");
		morseCode.put("p", ".--.");
		morseCode.put("q", "--.-");
		morseCode.put("r", ".-.");
		morseCode.put("s", "...");
		morseCode.put("t", "-");
		morseCode.put("u", "..-");
		morseCode.put("v", "...-");
		morseCode.put("w", ".--");
		morseCode.put("x", "-..-");
		morseCode.put("y", "-.--");
		morseCode.put("z", "--..");
		morseCode.put("1", ".----");
		morseCode.put("2", "..---");
		morseCode.put("3", "...--");
		morseCode.put("4", "....-");
		morseCode.put("5", ".....");
		morseCode.put("6", "-....");
		morseCode.put("7", "--...");
		morseCode.put("8", "---..");
		morseCode.put("9", "----.");
		morseCode.put("0", ".---- -----");
		String letter = "";
		String result = "";
		String searchTo = "";
		for (int i = 0; i < text.length(); i++) {
			if (i != 0) {
				result += " ";
			}
			searchTo = text.substring(i, i + 1);
			if (searchTo.equals(" ")) {
				letter = "|";
			} else {
				letter = morseCode.get(searchTo.toLowerCase());
			}
			result += letter;
		}

		return result;
	}

	public static void main(String[] args) {
		String expected = "- .... .- -. -.- | -.-- --- ..- | ...- . .-. -.-- | -- ..- -.-. ....";
		String result = translateToMorse("Thank you very much");

		System.out.println("'" + expected + "'");
		System.out.println("'" + result + "'");
	}
}
