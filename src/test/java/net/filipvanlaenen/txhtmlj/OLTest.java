package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>OL</code> class.
 */
public class OLTest {
    /**
     * Test verifying that a simple list item in an ordered list is exported correctly.
     */
    @Test
    void simpleOLWithLIIsConvertedCorrectlyToString() {
        OL ol = new OL();
        ol.addElement(new LI());
        assertEquals("<ol>\n  <li/>\n</ol>", ol.asString());
    }
}
