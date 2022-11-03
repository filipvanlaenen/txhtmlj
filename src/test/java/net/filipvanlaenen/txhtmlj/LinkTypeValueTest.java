package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>LinkTypeValue</code> class.
 */
public class LinkTypeValueTest {
    /**
     * Test verifying that the value for a link value is exported correctly.
     */
    @Test
    public void shouldExportValueOfDnsPrefetchCorrectly() {
        assertEquals("dns-prefetch", LinkTypeValue.DNS_PREFETCH.asString());
    }
}
