package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Header</code> class.
 */
public class HeaderTest {
    /**
     * Test verifying that a header with a simple paragraph with text is exported correctly.
     */
    @Test
    void headerWithPWithTextShouldBeConvertedCorrectlyToString() {
        Header header = new Header();
        header.addElement(new P("Hello, world!"));
        assertEquals("<header>\n  <p>Hello, world!</p>\n</header>", header.asString());
    }
}
