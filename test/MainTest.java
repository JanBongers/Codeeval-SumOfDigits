import nl.bongers.Main;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test() throws Exception {
        Main.main(new String[]{"resource/digit-file.txt"});
        assertEquals("5\n19\n35\n", outContent.toString());
    }
}

