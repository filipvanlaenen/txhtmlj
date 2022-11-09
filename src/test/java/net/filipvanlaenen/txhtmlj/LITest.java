package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>LI</code> class.
 */
public class LITest {
    /**
     * Test verifying that a simple list item with text is exported correctly.
     */
    @Test
    void simpleLIWithTextIsConvertedCorrectlyToString() {
        LI li = new LI("Hello, world!");
        assertEquals("<li>Hello, world!</li>", li.asString());
    }

    /**
     * Test verifying that a simple list item with a span element is exported correctly.
     */
    @Test
    void simpleLIWithSpanIsConvertedCorrectlyToString() {
        LI li = new LI();
        li.addElement(new Span("Foo"));
        assertEquals("<li>\n  <span>Foo</span>\n</li>", li.asString());
    }
}
