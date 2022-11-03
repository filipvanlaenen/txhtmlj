package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Link</code> class.
 */
public class LinkTest {
    /**
     * Test verifying a link referring to a style sheet is converted correctly.
     */
    @Test
    void linkReferringToStyleSheetIsConvertedCorrectlyToString() {
        Link link = new Link().href("/style/default.css").rel(LinkTypeValue.STYLESHEET).type("text/css");
        assertEquals("<link href=\"/style/default.css\" rel=\"stylesheet\" type=\"text/css\"/>", link.asString());
    }
}
