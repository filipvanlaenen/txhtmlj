package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>TH</code> class.
 */
public class THTest {
    /**
     * Test verifying that a simple TH with text is exported correctly.
     */
    @Test
    void simpleThWithTextIsConvertedCorrectlyToString() {
        TH th = new TH();
        th.addContent("Hello, world!");
        assertEquals("<th>Hello, world!</th>", th.asString());
    }

    /**
     * Test verifying that a simple TH with text and class is exported correctly.
     */
    @Test
    void simpleThWithTextAndClassIsConvertedCorrectlyToString() {
        TH th = new TH().clazz("foo");
        th.addContent("Hello, world!");
        assertEquals("<th class=\"foo\">Hello, world!</th>", th.asString());
    }

    /**
     * Test verifying that a TH with a link with text is exported correctly.
     */
    @Test
    void thWithLinkWithTextIsConvertedCorrectlyToString() {
        TH th = new TH();
        th.addElement(new A("Hello, world!").href("foo.html"));
        assertEquals("<th>\n  <a href=\"foo.html\">Hello, world!</a>\n</th>", th.asString());
    }
}
