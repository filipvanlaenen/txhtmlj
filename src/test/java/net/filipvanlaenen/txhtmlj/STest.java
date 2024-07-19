package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>S</code> class.
 */
public class STest {
    /**
     * Test verifying that simple inaccurate text is exported correctly.
     */
    @Test
    void simpleSWithTextIsConvertedCorrectlyToString() {
        S s = new S("Hello, world!");
        assertEquals("<s>Hello, world!</s>", s.asString());
    }

    /**
     * Test verifying that simple inaccurate text with a span element is exported correctly.
     */
    @Test
    void simpleSWithSpanIsConvertedCorrectlyToString() {
        S s = new S();
        s.addElement(new Span("Foo"));
        assertEquals("<s>\n  <span>Foo</span>\n</s>", s.asString());
    }
}
