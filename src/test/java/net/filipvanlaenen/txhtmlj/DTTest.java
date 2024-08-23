package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>DT</code> class.
 */
public class DTTest {
    /**
     * Test verifying that a simple term with text is exported correctly.
     */
    @Test
    void simpleDTWithTextIsConvertedCorrectlyToString() {
        DT dt = new DT("Foo");
        assertEquals("<dt>Foo</dt>", dt.asString());
    }

    /**
     * Test verifying that a simple term with a span element is exported correctly.
     */
    @Test
    void simpleDTWithSpanIsConvertedCorrectlyToString() {
        DT dt = new DT();
        dt.addElement(new Span("Foo"));
        assertEquals("<dt>\n  <span>Foo</span>\n</dt>", dt.asString());
    }
}
