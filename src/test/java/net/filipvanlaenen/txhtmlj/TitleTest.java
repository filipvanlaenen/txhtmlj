package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Title</code> class.
 */
public class TitleTest {
    /**
     * Test verifying that a simple title with text is exported correctly.
     */
    @Test
    void simpleTitleWithTextIsConvertedCorrectlyToString() {
        Title title = new Title("Hello, world!");
        assertEquals("<title>Hello, world!</title>", title.asString());
    }
}
