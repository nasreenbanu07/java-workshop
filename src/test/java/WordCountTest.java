import java.beans.Transient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountTest {
    @Test
    public void testWordCount() {
        WordCountTest wordcount = new WordCountTest();
        int count = wordcount.count("this is a test: ");
        Assertions.assertEquals(4,count);
    }

    @Test
    public void testAnotherString(){
        WordCountTest wordcount = new WordCountTest();
        int count = wordcount.count("this is another program");
        Assertions.assertEquals(4, wordcount);

    }



}
