package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>P</code> class.
 */
public class PTest {
    /**
     * Test verifying that a simple paragraph with text is exported correctly.
     */
    @Test
    void simplePWithTextIsConvertedCorrectlyToString() {
        P p = new P("Hello, world!");
        assertEquals("<p>Hello, world!</p>", p.asString());
    }
}
