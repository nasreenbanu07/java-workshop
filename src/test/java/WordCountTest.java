import java.beans.Transient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountTest {
    @Test
    public void testWordCount() {
        WordCountTest wordcount = new WordCountTest();
        int count = wordcount.count("input string");
        Assertions.assertEquals(10,count);
    }



}
