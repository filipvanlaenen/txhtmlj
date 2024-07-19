package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Mark</code> class.
 */
public class MarkTest {
    /**
     * Test verifying that simple marked text is exported correctly.
     */
    @Test
    void simpleMarkWithTextIsConvertedCorrectlyToString() {
        Mark mark = new Mark("Hello, world!");
        assertEquals("<mark>Hello, world!</mark>", mark.asString());
    }

    /**
     * Test verifying that simple marked text with a span element is exported correctly.
     */
    @Test
    void simpleMarkWithSpanIsConvertedCorrectlyToString() {
        Mark mark = new Mark();
        mark.addElement(new Span("Foo"));
        assertEquals("<mark>\n  <span>Foo</span>\n</mark>", mark.asString());
    }
}
