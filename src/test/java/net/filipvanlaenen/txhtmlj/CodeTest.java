package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Code</code> class.
 */
public class CodeTest {
    /**
     * Test verifying that simple code text is exported correctly.
     */
    @Test
    void simpleCodeWithTextIsConvertedCorrectlyToString() {
        Code code = new Code("Hello, world!");
        assertEquals("<code>Hello, world!</code>", code.asString());
    }

    /**
     * Test verifying that simple code text with a span element is exported correctly.
     */
    @Test
    void simpleCodeWithSpanIsConvertedCorrectlyToString() {
        Code code = new Code();
        code.addElement(new Span("Foo"));
        assertEquals("<code>\n  <span>Foo</span>\n</code>", code.asString());
    }
}
