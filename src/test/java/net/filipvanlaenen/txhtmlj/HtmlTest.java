package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Html</code> class.
 */
public class HtmlTest {
    /**
     * Test verifying that a simple HTML document is exported correctly.
     */
    @Test
    void simpleHtmlDocumentIsConvertedCorrectlyToString() {
        Head head = new Head();
        head.addElement(new Title("Hello, world!"));
        Body body = new Body();
        body.addElement(new P("Hello, world!"));
        Html html = new Html().addElement(head).addElement(body);
        assertEquals("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n  <head>\n    <title>Hello, world!</title>\n"
                + "  </head>\n  <body>\n    <p>Hello, world!</p>\n  </body>\n</html>", html.asString());
    }
}
