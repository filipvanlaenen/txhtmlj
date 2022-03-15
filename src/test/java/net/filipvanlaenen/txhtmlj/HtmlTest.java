package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Html</code> class.
 */
public class HtmlTest {
    /**
     * Test verifying that a simple HTML document with head and body is exported correctly.
     */
    @Test
    void simpleHtmlDocumentWithHeadAndBodyIsConvertedCorrectlyToString() {
        Head head = new Head().addElement(new Title("Hello, world!"));
        Body body = new Body().addElement(new P("Hello, world!"));
        Html html = new Html().addElement(head).addElement(body);
        assertEquals("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n  <head>\n    <title>Hello, world!</title>\n"
                + "  </head>\n  <body>\n    <p>Hello, world!</p>\n  </body>\n</html>", html.asString());
    }

    /**
     * Test verifying that a simple HTML document with body only is exported correctly.
     */
    @Test
    void simpleHtmlDocumentWithBodyOnlyIsConvertedCorrectlyToString() {
        Body body = new Body().addElement(new P("Hello, world!"));
        Html html = new Html().addElement(body);
        assertEquals("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n  <body>\n    <p>Hello, world!</p>\n"
                + "  </body>\n</html>", html.asString());
    }

    /**
     * Test verifying that a simple HTML document with head only is exported correctly.
     */
    @Test
    void simpleHtmlDocumentWithHeadOnlyIsConvertedCorrectlyToString() {
        Head head = new Head().addElement(new Title("Hello, world!"));
        Html html = new Html().addElement(head);
        assertEquals("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n  <head>\n    <title>Hello, world!</title>\n"
                + "  </head>\n</html>", html.asString());
    }
}
