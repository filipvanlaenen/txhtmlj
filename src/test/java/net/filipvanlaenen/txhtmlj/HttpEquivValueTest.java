package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>HttpEquivValue</code> class.
 */
public class HttpEquivValueTest {
    /**
     * Test verifying that the value for a HTTP equiv value is exported correctly.
     */
    @Test
    public void shouldExportValueOfContentLanguageCorrectly() {
        assertEquals("content-language", HttpEquivValue.CONTENT_LANGUAGE.asString());
    }
}
