package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>H5</code> class.
 */
public class H5Test {
    /**
     * Test verifying that a heading at level 5 with text is exported correctly.
     */
    @Test
    void simpleH5WithTextShouldBeConvertedCorrectlyToString() {
        H5 h5 = new H5("Hello, world!");
        assertEquals("<h5>Hello, world!</h5>", h5.asString());
    }
}
