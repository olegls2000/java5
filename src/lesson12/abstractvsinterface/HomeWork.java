package lesson12.abstractvsinterface;


public class HomeWork {
    public static void main(String[] args) {

        String symbol = "a";

        String sentence = "You are visiting the website of financial service providers AS LHV Pank";

        String[] sentenceToArray = sentence.split(" ");


        System.out.println("Longest the word is: " + sentenceToArray[getLongestWord(sentenceToArray)]);

        System.out.println("Shortest the word is: " + sentenceToArray[getShortestWord(sentenceToArray)]);

        getSwapLongestAndShortestWord(sentenceToArray);

        printWordsStarAndEndSameLetter(sentenceToArray,symbol);

    }


    public static int getLongestWord(String[] string) {

        int indexOfLongestWord = -1;
        int maxLenghtOfWord = 0;


        for (int i = 0; i < string.length; i++) {
            if (string[i].length() >= maxLenghtOfWord) {
                maxLenghtOfWord = string[i].length();
                indexOfLongestWord = i;
            }

        }
        return indexOfLongestWord;


    }


    public static int getShortestWord(String[] string) {

        int indexOfShortestWord = -1;

        int minLenghtOfWord = string[0].length();


        for (int i = 0; i < string.length; i++) {

            if (string[i].length() <= minLenghtOfWord) {
                minLenghtOfWord = string[i].length();
                indexOfShortestWord = i;
            }
        }

        return indexOfShortestWord;
    }


    public static void getSwapLongestAndShortestWord(String[] string) {

//TODO
        int tempIndexLongestWord = getLongestWord(string);

        int tempIndexShortestWord = getShortestWord(string);
        int indexTemp;
        indexTemp = tempIndexLongestWord;
        tempIndexLongestWord = tempIndexShortestWord;
        tempIndexShortestWord = indexTemp;


        System.out.println();
        System.out.println(indexTemp + tempIndexLongestWord + tempIndexShortestWord);

        //    getLongestAndShortestWord(string);
        //BtaUtils.swapElementsInArray(getLongestWord(string), getShortestWord(string),string);


    }

    public static void printWordsStarAndEndSameLetter(String[] string, String symbol) {
//TODO


        for (int i = 0; i < string.length; i++) {
            if (string[i].startsWith(symbol) == symbol || string[i].endsWith(symbol)==symbol) {
                System.out.println(string[i]);

            }

        }
}

}








