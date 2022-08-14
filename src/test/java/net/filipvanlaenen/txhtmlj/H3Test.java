package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>H3</code> class.
 */
public class H3Test {
    /**
     * Test verifying that a heading at level 3 with text is exported correctly.
     */
    @Test
    void simpleH3WithTextShouldBeConvertedCorrectlyToString() {
        H3 h3 = new H3("Hello, world!");
        assertEquals("<h3>Hello, world!</h3>", h3.asString());
    }
}
