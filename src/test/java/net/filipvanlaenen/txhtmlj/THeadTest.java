package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>THead</code> class.
 */
public class THeadTest {
    /**
     * Test verifying that a simple table head with a table row is exported correctly.
     */
    @Test
    void tableHeadWithTableRowIsConvertedCorrectlyToString() {
        THead thead = new THead();
        thead.addElement(new TR());
        assertEquals("<thead>\n  <tr/>\n</thead>", thead.asString());
    }
}
