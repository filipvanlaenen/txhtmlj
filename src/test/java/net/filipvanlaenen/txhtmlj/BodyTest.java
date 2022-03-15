package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Body</code> class.
 */
public class BodyTest {
    /**
     * Test verifying that a body with a simple paragraph with text is exported correctly.
     */
    @Test
    void bodyWithPWithTextIsConvertedCorrectlyToString() {
        Body body = new Body().addElement(new P("Hello, world!"));
        assertEquals("<body>\n  <p>Hello, world!</p>\n</body>", body.asString());
    }
}
