package Lesson13;
import utils.BtaStringUtils;

public class HomeWork {
    public static void main(String[] args) {


    }
    private static void swapLongestWithShortest(String sentence){
        String[] words = BtaStringUtils.splitToWords( sentence);
        int indexLongest = getIndexOfLongest(words);
        int indexOfShortest = getIndexOfShortest(words);
        swapWords(indexLongest, indexOfShortest, words);
    }

    private static int getIndexOfLongest(String[] words){
        return 0;
    }
    private static int getIndexOfShortest(String[] words){
      return 0;
    }
    private static void swapWords(int firstIndex, int secondIndex, String[] words){
        String temp = words[firstIndex];
        words[firstIndex] = words[secondIndex];
        words[secondIndex] = temp;
    }


}
