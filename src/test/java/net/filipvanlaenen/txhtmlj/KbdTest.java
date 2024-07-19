package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Kbd</code> class.
 */
public class KbdTest {
    /**
     * Test verifying that simple keyboard text is exported correctly.
     */
    @Test
    void simpleKbdWithTextIsConvertedCorrectlyToString() {
        Kbd kbd = new Kbd("Hello, world!");
        assertEquals("<kbd>Hello, world!</kbd>", kbd.asString());
    }

    /**
     * Test verifying that simple keyboard text with a span element is exported correctly.
     */
    @Test
    void simpleKbdWithSpanIsConvertedCorrectlyToString() {
        Kbd kbd = new Kbd();
        kbd.addElement(new Span("Foo"));
        assertEquals("<kbd>\n  <span>Foo</span>\n</kbd>", kbd.asString());
    }
}
