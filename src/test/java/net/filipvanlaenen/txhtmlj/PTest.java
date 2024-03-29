package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>P</code> class.
 */
public class PTest {
    /**
     * Test verifying that a simple paragraph with text is exported correctly.
     */
    @Test
    void simplePWithTextIsConvertedCorrectlyToString() {
        P p = new P("Hello, world!");
        assertEquals("<p>Hello, world!</p>", p.asString());
    }

    /**
     * Test verifying that a simple paragraph with a span element is exported correctly.
     */
    @Test
    void simplePWithSpanIsConvertedCorrectlyToString() {
        P p = new P();
        p.addElement(new Span("Foo"));
        assertEquals("<p>\n  <span>Foo</span>\n</p>", p.asString());
    }

    /**
     * Test verifying that a paragraph with text and ID is exported correctly.
     */
    @Test
    void paragraphWithTextAndIdIsConvertedCorrectlyToString() {
        P p = new P("Foo").id("foo");
        assertEquals("<p id=\"foo\">Foo</p>", p.asString());
    }

}
