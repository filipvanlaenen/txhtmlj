package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Img</code> class.
 */
public class ImgTest {
    /**
     * Test verifying that a simple img with src is exported correctly.
     */
    @Test
    public void shouldExportImgWithSrcCorrectlyToString() {
        Img img = new Img().src("foo.jpg");
        assertEquals("<img src=\"foo.jpg\"/>", img.asString());
    }

    /**
     * Test verifying that a simple img with src and alt is exported correctly.
     */
    @Test
    public void shouldExportImgWithSrcAndAltCorrectlyToString() {
        Img img = new Img().src("foo.jpg").alt("A picture of foo");
        assertEquals("<img alt=\"A picture of foo\" src=\"foo.jpg\"/>", img.asString());
    }
}
