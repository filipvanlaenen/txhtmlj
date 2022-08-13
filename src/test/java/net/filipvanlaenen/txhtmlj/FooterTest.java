package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Footer</code> class.
 */
public class FooterTest {
    /**
     * Test verifying that a footer with a simple paragraph with text is exported correctly.
     */
    @Test
    void footerWithPWithTextShouldBeConvertedCorrectlyToString() {
        Footer footer = new Footer();
        footer.addElement(new P("Hello, world!"));
        assertEquals("<footer>\n  <p>Hello, world!</p>\n</footer>", footer.asString());
    }
}
