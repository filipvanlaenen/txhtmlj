package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Small</code> class.
 */
public class SmallTest {
    /**
     * Test verifying that simple small print text is exported correctly.
     */
    @Test
    void simpleSmallWithTextIsConvertedCorrectlyToString() {
        Small small = new Small("Hello, world!");
        assertEquals("<small>Hello, world!</small>", small.asString());
    }

    /**
     * Test verifying that simple small print text with a span element is exported correctly.
     */
    @Test
    void simpleSmallWithSpanIsConvertedCorrectlyToString() {
        Small small = new Small();
        small.addElement(new Span("Foo"));
        assertEquals("<small>\n  <span>Foo</span>\n</small>", small.asString());
    }
}
