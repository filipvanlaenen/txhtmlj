package net.filipvanlaenen.txhtmlj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>H1</code> class.
 */
public class HTest {
    /**
     * Local subclass of H for testing purposes.
     */
    private class MyH1 extends H {
        /**
         * Constructs a heading element with a string as its content.
         *
         * @param content A string.
         */
        protected MyH1(final String content) {
            super(content);
        }

        @Override
        protected int getLevel() {
            return 1;
        }
    }

    /**
     * Test verifying that the getElementName appends the level to the letter h.
     */
    @Test
    public void getElementNameShouldAppendLevelToLetterH() {
        assertEquals("h1", new MyH1("Foo").getElementName());
    }
}
