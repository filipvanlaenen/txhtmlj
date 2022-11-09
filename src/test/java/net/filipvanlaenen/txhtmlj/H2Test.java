package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>H2</code> class.
 */
public class H2Test {
    /**
     * Test verifying that a heading at level 2 with text is exported correctly.
     */
    @Test
    void simpleH2WithTextShouldBeConvertedCorrectlyToString() {
        H2 h2 = new H2("Hello, world!");
        assertEquals("<h2>Hello, world!</h2>", h2.asString());
    }

    /**
     * Test verifying that a heading at level 2 with text and class is exported correctly.
     */
    @Test
    public void h2WithTextAndClassShouldBeConvertedCorrectlyToString() {
        H2 h2 = new H2("Hello, world!").clazz("foo");
        assertEquals("<h2 class=\"foo\">Hello, world!</h2>", h2.asString());
    }
}
