package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>UL</code> class.
 */
public class ULTest {
    /**
     * Test verifying that a simple list item in an unordered list is exported correctly.
     */
    @Test
    void simpleULWithLIIsConvertedCorrectlyToString() {
        UL ul = new UL();
        ul.addElement(new LI());
        assertEquals("<ul>\n  <li/>\n</ul>", ul.asString());
    }
}
