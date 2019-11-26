package joker;

import org.junit.Test;
import static org.junit.Assert.*;

public class WitzeTest {
    @Test 
    public void TestThatWitzHasContent() {
        String content = "Rollt ein Ball um die Ecke und fällt um.";
        Witz meinWitz = new Witz(content);

        assertEquals(meinWitz.getContent(), content);
    }
}