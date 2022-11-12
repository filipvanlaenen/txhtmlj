package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>I</code> class.
 */
public class ITest {
    /**
     * Test verifying that simple italic text is exported correctly.
     */
    @Test
    void simpleIWithTextIsConvertedCorrectlyToString() {
        I i = new I("Hello, world!");
        assertEquals("<i>Hello, world!</i>", i.asString());
    }

    /**
     * Test verifying that simple italic text with a span element is exported correctly.
     */
    @Test
    void simpleIWithSpanIsConvertedCorrectlyToString() {
        I i = new I();
        i.addElement(new Span("Foo"));
        assertEquals("<i>\n  <span>Foo</span>\n</i>", i.asString());
    }
}
