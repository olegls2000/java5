package utils;

public final class BtaStringUtils {

    private BtaStringUtils() {

    }

    public static void printDuplicates(String sentence){
        String[] words = splitToWords(sentence);
        for (int i = 0; i < words.length; i++) {

        }
    }


    public static String[] splitToWords(String sentence){
        String[] result = sentence.split("");
        for (int i = 0; i < result.length; i++) {
            result[i] = cleanUpWord((result[i]));
        }
        return result;
    }


    public static String cleanUpWord(String rawWord){
       return rawWord = rawWord.replace('.', ' ')
        .replace('!', ' ')
        .replace(';', ' ')
        .replace(',', ' ')
        .replace('?', ' ')
        .replace(':', ' ')
        .trim();
    }
}
