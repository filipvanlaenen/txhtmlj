package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Pre</code> class.
 */
public class PreTest {
    /**
     * Test verifying that a simple block of preformatted text with text is exported correctly.
     */
    @Test
    void simplePreWithTextIsConvertedCorrectlyToString() {
        Pre pre = new Pre("Hello, world!");
        assertEquals("<pre>Hello, world!</pre>", pre.asString());
    }

    /**
     * Test verifying that a simple block of preformatted text with a span element is exported correctly.
     */
    @Test
    void simplePreWithSpanIsConvertedCorrectlyToString() {
        Pre pre = new Pre();
        pre.addElement(new Span("Foo"));
        assertEquals("<pre>\n  <span>Foo</span>\n</pre>", pre.asString());
    }

    /**
     * Test verifying that a block of preformatted text with text and ID is exported correctly.
     */
    @Test
    void preformattedTextWithTextAndIdIsConvertedCorrectlyToString() {
        Pre pre = new Pre("Foo").id("foo");
        assertEquals("<pre id=\"foo\">Foo</pre>", pre.asString());
    }

}
