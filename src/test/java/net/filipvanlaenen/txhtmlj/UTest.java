package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>U</code> class.
 */
public class UTest {
    /**
     * Test verifying that simple text with an unarticulated non-textual annotation is exported correctly.
     */
    @Test
    void simpleUWithTextIsConvertedCorrectlyToString() {
        U u = new U("Hello, world!");
        assertEquals("<u>Hello, world!</u>", u.asString());
    }

    /**
     * Test verifying that simple text with an unarticulated non-textual annotation with a span element is exported
     * correctly.
     */
    @Test
    void simpleUWithSpanIsConvertedCorrectlyToString() {
        U u = new U();
        u.addElement(new Span("Foo"));
        assertEquals("<u>\n  <span>Foo</span>\n</u>", u.asString());
    }
}
