package joker;

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class AusgabeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void AusgabeShouldPrintContentOfWitz() {
        String content = "demo content";
        Witz witz = new Witz(content);
        
        ConsoleAusgabe ausgabe = new ConsoleAusgabe();
        ausgabe.ausgeben(witz);

        assertEquals(content, outContent.toString());
    }
}