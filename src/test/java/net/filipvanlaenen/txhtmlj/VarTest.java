package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Var</code> class.
 */
public class VarTest {
    /**
     * Test verifying that simple variable text is exported correctly.
     */
    @Test
    void simpleVarWithTextIsConvertedCorrectlyToString() {
        Var var = new Var("Hello, world!");
        assertEquals("<var>Hello, world!</var>", var.asString());
    }

    /**
     * Test verifying that simple variable text with a span element is exported correctly.
     */
    @Test
    void simpleVarWithSpanIsConvertedCorrectlyToString() {
        Var var = new Var();
        var.addElement(new Span("Foo"));
        assertEquals("<var>\n  <span>Foo</span>\n</var>", var.asString());
    }
}
