package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Sup</code> class.
 */
public class SupTest {
    /**
     * Test verifying that simple superscript text is exported correctly.
     */
    @Test
    void simpleSupWithTextIsConvertedCorrectlyToString() {
        Sup sup = new Sup("Hello, world!");
        assertEquals("<sup>Hello, world!</sup>", sup.asString());
    }

    /**
     * Test verifying that simple superscript text with a span element is exported correctly.
     */
    @Test
    void simpleSupWithSpanIsConvertedCorrectlyToString() {
        Sup sup = new Sup();
        sup.addElement(new Span("Foo"));
        assertEquals("<sup>\n  <span>Foo</span>\n</sup>", sup.asString());
    }
}
