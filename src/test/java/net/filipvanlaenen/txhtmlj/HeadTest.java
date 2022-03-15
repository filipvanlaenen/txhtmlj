package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Head</code> class.
 */
public class HeadTest {
    /**
     * Test verifying that a head with a title with text is exported correctly.
     */
    @Test
    void headWithTitleWithTextIsConvertedCorrectlyToString() {
        Head head = new Head().addElement(new Title("Hello, world!"));
        assertEquals("<head>\n  <title>Hello, world!</title>\n</head>", head.asString());
    }
}
