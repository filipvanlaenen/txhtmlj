package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Sub</code> class.
 */
public class SubTest {
    /**
     * Test verifying that simple subscript text is exported correctly.
     */
    @Test
    void simpleSubWithTextIsConvertedCorrectlyToString() {
        Sub sub = new Sub("Hello, world!");
        assertEquals("<sub>Hello, world!</sub>", sub.asString());
    }

    /**
     * Test verifying that simple subscript text with a span element is exported correctly.
     */
    @Test
    void simpleSubWithSpanIsConvertedCorrectlyToString() {
        Sub sub = new Sub();
        sub.addElement(new Span("Foo"));
        assertEquals("<sub>\n  <span>Foo</span>\n</sub>", sub.asString());
    }
}
