package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>TD</code> class.
 */
public class TDTest {
    /**
     * Test verifying that a simple TD with text is exported correctly.
     */
    @Test
    void simpleTdWithTextIsConvertedCorrectlyToString() {
        TD td = new TD();
        td.addContent("Hello, world!");
        assertEquals("<td>Hello, world!</td>", td.asString());
    }

    /**
     * Test verifying that a simple TD with text and class is exported correctly.
     */
    @Test
    void simpleTdWithTextAndClassIsConvertedCorrectlyToString() {
        TD td = new TD().clazz("foo");
        td.addContent("Hello, world!");
        assertEquals("<td class=\"foo\">Hello, world!</td>", td.asString());
    }

    /**
     * Test verifying that a TD with a link with text is exported correctly.
     */
    @Test
    void tdWithLinkWithTextIsConvertedCorrectlyToString() {
        TD td = new TD();
        td.addElement(new A("Hello, world!").href("foo.html"));
        assertEquals("<td>\n  <a href=\"foo.html\">Hello, world!</a>\n</td>", td.asString());
    }
}
