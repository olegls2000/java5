package lesson12.abstractvsinterface;

import java.util.Scanner;

public class HomeWork {

	public static class FemaleLogic {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String line = scan.nextLine();
			String longWord = "", shortWord = line;
			for (String s : line.split(" ")) {
				if (s.length() > longWord.length()) longWord = s;
				if (s.length() < shortWord.length()) shortWord = s;
			}
			System.out.println("Longest word: '" + longWord + "'");
			System.out.println("Shortest word: '" + shortWord + "'");
		}

		public static void getSwapLongestAndShortestWord(String[] string) {

			int tempIndexLongestWord = getLongestWord(string);

			int tempIndexShortestWord = getShortestWord(string);
			int indexTemp;
			indexTemp = tempIndexLongestWord;
			tempIndexLongestWord = tempIndexShortestWord;
			tempIndexShortestWord = indexTemp;


			System.out.println();
			System.out.println(indexTemp + tempIndexLongestWord + tempIndexShortestWord);
		}

		private static int getShortestWord(String[] string) {


			return 0;
		}

		private static int getLongestWord(String[] string) {
			return 0;
		}

		public static int printWordsStarAndEndSameLetter(String[] string, String symbol) {


			for (int i = 0; i < string.length; i++) {
				if (string[i].startsWith(symbol) && string[i].endsWith(symbol)) {
					System.out.println(string[i]);

				}

			}


			return 0;
		}
	}
}