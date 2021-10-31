package lesson13;

import utils.BtaStringUtils;

public class ClassWork {

    public static void main(String[] args) {
        String sentence = "Hi joe. I am Joe too! Hi joe, then.";
        //String [] words = BtaStringUtils.splitToWords(sentence);
        BtaStringUtils.printDuplicates(sentence);
    }
}
