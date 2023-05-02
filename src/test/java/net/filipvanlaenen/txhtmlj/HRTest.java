package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>HR</code> class.
 */
public class HRTest {
    /**
     * Test verifying that a simple HR is exported correctly.
     */
    @Test
    public void shouldExportHRCorrectlyToString() {
        HR hr = new HR();
        assertEquals("<hr/>", hr.asString());
    }
}
