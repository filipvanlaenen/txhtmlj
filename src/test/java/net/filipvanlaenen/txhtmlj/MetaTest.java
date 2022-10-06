package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Meta</code> class.
 */
public class MetaTest {
    /**
     * Test verifying that meta element setting UTF-8 as the encoding is converted correctly.
     */
    @Test
    void metaElementToSetUtf8EncodingIsConvertedCorrectlyToString() {
        Meta meta = new Meta().httpEquiv(HttpEquivValue.CONTENT_TYPE).content("text/html; charset=UTF-8");
        assertEquals("<meta content=\"text/html; charset=UTF-8\" http-equiv=\"content-type\"/>", meta.asString());
    }
}
