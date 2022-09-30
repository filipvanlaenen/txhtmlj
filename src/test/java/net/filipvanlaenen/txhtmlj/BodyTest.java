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
        Body body = new Body();
        body.addElement(new P("Hello, world!"));
        assertEquals("<body>\n  <p>Hello, world!</p>\n</body>", body.asString());
    }

    /**
     * Test verifying that a body with a simple paragraph with text and an onload event is exported correctly.
     */
    @Test
    void bodyWithPWithTextAndOnloadEventIsConvertedCorrectlyToString() {
        Body body = new Body().onload("foo();");
        body.addElement(new P("Hello, world!"));
        assertEquals("<body onload=\"foo();\">\n  <p>Hello, world!</p>\n</body>", body.asString());
    }
}
