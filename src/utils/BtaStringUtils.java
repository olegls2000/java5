package utils;

public final class BtaStringUtils { // final отсекает наследование, что бы никто не смог предопределить

    private BtaStringUtils() { // private - нельзя их этого класса сделать объект
        throw new RuntimeException("Отвали!");
    }

    public static void printDuplicates(String sentence) {
        String[] words = splitToWords(sentence);
        for (int i = 0; i < words.length; i++) {
            int count = getCountOfEntrance(words[i], words);
            if (count > 1) {
                System.out.println(words[i] + ":  " + count + " times.");
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
        String cleanedSentence = cleanUpWord(sentence);
        return cleanedSentence.split(" ");
    }


    public static String cleanUpWord(String rawWord) {

        return rawWord // нехер писать комменты, и так всё понятно!
                .replace('.', ' ')
                .replace(',', ' ')
                .replace('!', ' ')
                .replace('?', ' ')
                .replace(';', ' ')
                .replace(':', ' ')
                .replace('*', ' ');
    }

}
