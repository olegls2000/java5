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
	}

	}
