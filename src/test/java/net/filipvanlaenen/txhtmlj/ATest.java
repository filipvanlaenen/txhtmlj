package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>A</code> class.
 */
public class ATest {
    /**
     * Test verifying that a simple link with text is exported correctly.
     */
    @Test
    void simpleLinkWithTextIsConvertedCorrectlyToString() {
        A a = new A("Foo").href("foo.html");
        assertEquals("<a href=\"foo.html\">Foo</a>", a.asString());
    }
    /**
     * Test verifying that a link with text and class is exported correctly.
     */
    @Test
    void linkWithTextAndClassIsConvertedCorrectlyToString() {
        A a = new A("Foo").clazz("foo").href("foo.html");
        assertEquals("<a class=\"foo\" href=\"foo.html\">Foo</a>", a.asString());
    }
}
