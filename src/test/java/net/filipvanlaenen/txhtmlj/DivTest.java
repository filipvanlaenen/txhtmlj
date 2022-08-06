package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Div</code> class.
 */
public class DivTest {
    /**
     * Test verifying that a simple div with text is exported correctly.
     */
    @Test
    void simpleDivWithTextIsConvertedCorrectlyToString() {
        Div div = new Div("Hello, world!");
        assertEquals("<div>Hello, world!</div>", div.asString());
    }

    /**
     * Test verifying that a div with text and a class attributed is exported correctly.
     */
    @Test
    void simpleDivWithTextAndClassAttributeIsConvertedCorrectlyToString() {
        Div div = new Div("Hello, world!").clazz("foo");
        assertEquals("<div class=\"foo\">Hello, world!</div>", div.asString());
    }
}
