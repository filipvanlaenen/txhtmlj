package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>BR</code> class.
 */
public class BRTest {
    /**
     * Test verifying that a simple BR is exported correctly.
     */
    @Test
    public void shouldExportBRCorrectlyToString() {
        BR br = new BR();
        assertEquals("<br/>", br.asString());
    }
}
