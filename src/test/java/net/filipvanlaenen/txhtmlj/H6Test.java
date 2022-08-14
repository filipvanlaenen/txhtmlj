package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>H6</code> class.
 */
public class H6Test {
    /**
     * Test verifying that a heading at level 6 with text is exported correctly.
     */
    @Test
    void simpleH6WithTextShouldBeConvertedCorrectlyToString() {
        H6 h6 = new H6("Hello, world!");
        assertEquals("<h6>Hello, world!</h6>", h6.asString());
    }
}
