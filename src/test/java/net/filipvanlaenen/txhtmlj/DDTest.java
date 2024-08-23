package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>DD</code> class.
 */
public class DDTest {
    /**
     * Test verifying that a simple description with text is exported correctly.
     */
    @Test
    void simpleDDWithTextIsConvertedCorrectlyToString() {
        DD dd = new DD("Foo");
        assertEquals("<dd>Foo</dd>", dd.asString());
    }

    /**
     * Test verifying that a simple description with a span element is exported correctly.
     */
    @Test
    void simpleDDWithSpanIsConvertedCorrectlyToString() {
        DD dd = new DD();
        dd.addElement(new Span("Foo"));
        assertEquals("<dd>\n  <span>Foo</span>\n</dd>", dd.asString());
    }
}
