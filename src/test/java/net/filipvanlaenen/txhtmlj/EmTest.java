package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Em</code> class.
 */
public class EmTest {
    /**
     * Test verifying that simple emphasized text is exported correctly.
     */
    @Test
    void simpleEmWithTextIsConvertedCorrectlyToString() {
        Em em = new Em("Hello, world!");
        assertEquals("<em>Hello, world!</em>", em.asString());
    }

    /**
     * Test verifying that simple emphasized text with a span element is exported correctly.
     */
    @Test
    void simpleEmWithSpanIsConvertedCorrectlyToString() {
        Em em = new Em();
        em.addElement(new Span("Foo"));
        assertEquals("<em>\n  <span>Foo</span>\n</em>", em.asString());
    }
}
