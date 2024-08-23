package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>DL</code> class.
 */
public class DLTest {
    /**
     * Test verifying that a simple description list with a term and a description is exported correctly.
     */
    @Test
    void simpleDLWithDTAndDDConvertedCorrectlyToString() {
        DL dl = new DL();
        dl.addElement(new DT("Foo"));
        dl.addElement(new DD("A bar"));
        assertEquals("<dl>\n  <dt>Foo</dt>\n  <dd>A bar</dd>\n</dl>", dl.asString());
    }
}
