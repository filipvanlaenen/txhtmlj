package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>H4</code> class.
 */
public class H4Test {
    /**
     * Test verifying that a heading at level 4 with text is exported correctly.
     */
    @Test
    void simpleH4WithTextShouldBeConvertedCorrectlyToString() {
        H4 h4 = new H4("Hello, world!");
        assertEquals("<h4>Hello, world!</h4>", h4.asString());
    }
}
