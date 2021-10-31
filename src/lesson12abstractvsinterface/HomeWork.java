package lesson12abstractvsinterface;

import java.util.Scanner;

public class HomeWork {

    public static class FemaleLogic {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a sentence: ");
            String line = scan.nextLine();
            System.out.println("Thank you! Now i will do the job for you, looser!");
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
