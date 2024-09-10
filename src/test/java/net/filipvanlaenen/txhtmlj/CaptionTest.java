package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Caption</code> class.
 */
public class CaptionTest {
    /**
     * Test verifying that a simple caption with text is exported correctly.
     */
    @Test
    void simpleCaptionWithTextIsConvertedCorrectlyToString() {
        Caption caption = new Caption("Hello, world!");
        assertEquals("<caption>Hello, world!</caption>", caption.asString());
    }

    /**
     * Test verifying that a simple caption with a span element is exported correctly.
     */
    @Test
    void simpleCaptionWithSpanIsConvertedCorrectlyToString() {
        Caption caption = new Caption();
        caption.addElement(new Span("Foo"));
        assertEquals("<caption>\n  <span>Foo</span>\n</caption>", caption.asString());
    }

}
