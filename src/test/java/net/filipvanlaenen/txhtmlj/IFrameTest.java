package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>IFrame</code> class.
 */
public class IFrameTest {
    /**
     * Test verifying that a simple iframe with src is exported correctly.
     */
    @Test
    public void shouldExportImgWithSrcCorrectlyToString() {
        IFrame iframe = new IFrame().src("foo.html");
        assertEquals("<iframe src=\"foo.html\"/>", iframe.asString());
    }
}
