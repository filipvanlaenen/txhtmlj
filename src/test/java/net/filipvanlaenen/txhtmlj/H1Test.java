package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>H1</code> class.
 */
public class H1Test {
    /**
     * Test verifying that a heading at level 1 with text is exported correctly.
     */
    @Test
    public void simpleH1WithTextShouldBeConvertedCorrectlyToString() {
        H1 h1 = new H1("Hello, world!");
        assertEquals("<h1>Hello, world!</h1>", h1.asString());
    }

    /**
     * Test verifying that a heading at level 1 with text and class is exported correctly.
     */
    @Test
    public void h1WithTextAndClassShouldBeConvertedCorrectlyToString() {
        H1 h1 = new H1("Hello, world!").clazz("foo");
        assertEquals("<h1 class=\"foo\">Hello, world!</h1>", h1.asString());
    }
}
