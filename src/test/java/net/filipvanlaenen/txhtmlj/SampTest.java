package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Samp</code> class.
 */
public class SampTest {
    /**
     * Test verifying that simple sample text is exported correctly.
     */
    @Test
    void simpleSampWithTextIsConvertedCorrectlyToString() {
        Samp samp = new Samp("Hello, world!");
        assertEquals("<samp>Hello, world!</samp>", samp.asString());
    }

    /**
     * Test verifying that simple sample text with a span element is exported correctly.
     */
    @Test
    void simpleSampWithSpanIsConvertedCorrectlyToString() {
        Samp samp = new Samp();
        samp.addElement(new Span("Foo"));
        assertEquals("<samp>\n  <span>Foo</span>\n</samp>", samp.asString());
    }
}
