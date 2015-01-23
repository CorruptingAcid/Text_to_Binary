public class Conversions {

	// kicking off the whole program
	public static void main(String[] args0) {

		// checks to verify input was given at program start
		if (args0.length <= 0 || args0.length > 2) {
			System.out
					.println("There was an error you did not give this program valid input. This program takes in a string and an optional argument of -v.");
			System.exit(0);
		}
		if (args0.length == 2 && args0[1].equalsIgnoreCase("-v")) {
			Verbose(args0[0]);
		} else {
			NotVerbose(args0[0]);
		}

	}

	/**
	 * This word will be converted into decimal, then binary and all steps will
	 * be printed
	 * 
	 * @param word
	 */
	private static void Verbose(String word) {
		// this method is static since this is a very small program and OOP is
		// unnecessary for the very small scope
		String binary = "";
		// this for loop will go over the entirety of the word and convert to
		// binary and print each step on a separate line, before printing final
		// results on last line
		for (int i = 0; i <= word.length() - 1; i++) {
			int letter = word.charAt(i);
			String tempBinary = "";

			System.out.println("\n");
			System.out.println("The letter " + word.charAt(i) + " is " + letter
					+ " in decimal based on ASCII values.\n");

			while (letter > 0) {
				System.out.println(letter + "/2 = " + (letter / 2)
						+ " Remainder " + letter % 2);
				tempBinary += letter % 2;
				letter = letter / 2;
			}
			// reversing the tempBinary string because for some reason that is how this method of conversion works.
			tempBinary = new StringBuilder(tempBinary).reverse().toString();
			System.out.println("\nTherefore the letter " + word.charAt(i)
					+ " is " + tempBinary
					+ " When converted to binary based on ASCII tables.");
			// Trailing space is irrelevant since it will be on the end of a println
			binary += tempBinary + " ";
		}
		System.out.println("\n" + word
				+ " translated to binary based on ASCII values is " + binary);

	}

	/**
	 * This word will be converted into decimal, then binary and only the
	 * results will be printed
	 * 
	 * @param word
	 */
	private static void NotVerbose(String word) {
		// this method is static since this is a very small program and OOP is
		// unnecessary for the very small scope
		String binary = "";
		System.out.print("The given input of "+word+" is ");
		// this for loop will go over the entirety of the word and convert to
		// binary
		for (int i = 0; i < word.length()-1; i++) {
			int letter = word.charAt(i);
			binary += Integer.toBinaryString(letter) +" ";
		}
		System.out.print(binary);
		// so the next output will be on the next line (probably not needed, but
		// if this program were to be called by another program then it could be
		// good)
		System.out.print("\n");
	}
}
