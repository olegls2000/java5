package org.bta.lesson.utils;

public final class BtaStringUtils {

    private BtaStringUtils() {
        throw new RuntimeException("Prohibited!");
    }

    public static void printDuplicates(String sentence) {
        String[] words = splitToWords(sentence);
        for (int i = 0; i < words.length; i++) {
            int count = getCountOfEntrance(words[i], words);
            if (count > 1) {
                System.out.println(words[i] + ":  " + count + " times");
            }
        }
    }

    public static int getCountOfEntrance(String lookupWord, String[] words) {
        int count = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(lookupWord)) {
                count++;
            }
        }
        return count;
    }

    public static String[] splitToWords(String sentence) {
        String cleanedSentence = cleanUpSentence(sentence);
        return cleanedSentence.split(" ", 0);
    }

    public static String cleanUpSentence(String rawWord) {
        return rawWord
                .replace('.', ' ')
                .replace('!', ' ')
                .replace(',', ' ')
                .replace('?', ' ')
                .replace(';', ' ')
                .replace(':', ' ');
    }


}
