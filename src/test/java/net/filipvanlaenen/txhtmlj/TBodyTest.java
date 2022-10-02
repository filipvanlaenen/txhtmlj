package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>TBody</code> class.
 */
public class TBodyTest {
    /**
     * Test verifying that a simple table body with a table row is exported correctly.
     */
    @Test
    void tableBodyWithTableRowIsConvertedCorrectlyToString() {
        TBody tBody = new TBody();
        tBody.addElement(new TR());
        assertEquals("<tbody>\n  <tr/>\n</tbody>", tBody.asString());
    }
}
