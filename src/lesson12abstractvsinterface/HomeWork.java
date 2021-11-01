package lesson12abstractvsinterface;

import utils.BtaStringUtils;

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

        private static void swapLongestWithShortest(String sentence) {
            String[] words = BtaStringUtils.splitToWords(sentence);
            int indexLongest = getIndexOfLongest(words);
            int indexOfShortest = getIndexOfShortest(words);
            swapWords(indexLongest, indexLongest, words);

        }

        private static int getIndexOfLongest(String[] words) {
            return -1;
        }

        private static int getIndexOfShortest(String[] words) {
            return -1;
        }

        private static void swapWords(int firstIndex, int secondIndex, String[] words) {
            String temp = words[firstIndex];
            words[firstIndex] = words[secondIndex];
            words[secondIndex] = temp;

        }

        private static void print(String[] words) {

            for (String word : words) {
                System.out.println(word + " ");

            }
        }
    }
}



