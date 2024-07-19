package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>B</code> class.
 */
public class BTest {
    /**
     * Test verifying that simple bold text is exported correctly.
     */
    @Test
    void simpleBWithTextIsConvertedCorrectlyToString() {
        B b = new B("Hello, world!");
        assertEquals("<b>Hello, world!</b>", b.asString());
    }

    /**
     * Test verifying that simple bold text with a span element is exported correctly.
     */
    @Test
    void simpleBWithSpanIsConvertedCorrectlyToString() {
        B b = new B();
        b.addElement(new Span("Foo"));
        assertEquals("<b>\n  <span>Foo</span>\n</b>", b.asString());
    }
}
