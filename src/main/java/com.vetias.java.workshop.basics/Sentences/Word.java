
public class Word {
    public static void main(String[] args) {
        String sentence=" this program show how to split a string we need to find the senteences";
        String[] sentences =sentence.split("\\.");
        int sentencecount=sentences.length;
        System.out.println("no of lines:"+sentencecount);
        String[] words = sentence.split("");
        int wordcount = words.length;
        String[] letter = sentence.split("");
        int lettercount = letter.length;
        System.out.println("no.of letters:"+lettercount);

    }

}
