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
        Div div = new Div();
        div.addContent("Hello, world!");
        assertEquals("<div>Hello, world!</div>", div.asString());
    }

    /**
     * Test verifying that a simple div with another div is exported correctly.
     */
    @Test
    void simpleDivWithAnotherDivIsConvertedCorrectlyToString() {
        Div div = new Div();
        Div subdiv = new Div();
        subdiv.addContent("Hello, world!");
        div.addElement(subdiv);
        assertEquals("<div>\n  <div>Hello, world!</div>\n</div>", div.asString());
    }

    /**
     * Test verifying that a div with text and a class attributed is exported correctly.
     */
    @Test
    void simpleDivWithTextAndClassAttributeIsConvertedCorrectlyToString() {
        Div div = new Div().clazz("foo");
        div.addContent("Hello, world!");
        assertEquals("<div class=\"foo\">Hello, world!</div>", div.asString());
    }
}
