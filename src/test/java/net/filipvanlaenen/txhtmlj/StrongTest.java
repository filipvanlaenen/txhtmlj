package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Strong</code> class.
 */
public class StrongTest {
    /**
     * Test verifying that simple strong text is exported correctly.
     */
    @Test
    void simpleStrongWithTextIsConvertedCorrectlyToString() {
        Strong strong = new Strong("Hello, world!");
        assertEquals("<strong>Hello, world!</strong>", strong.asString());
    }

    /**
     * Test verifying that simple strong text with a span element is exported correctly.
     */
    @Test
    void simpleStrongWithSpanIsConvertedCorrectlyToString() {
        Strong strong = new Strong();
        strong.addElement(new Span("Foo"));
        assertEquals("<strong>\n  <span>Foo</span>\n</strong>", strong.asString());
    }
}
