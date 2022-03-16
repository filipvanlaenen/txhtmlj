package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Html</code> class.
 */
public class HtmlTest {
    /**
     * Test verifying that a simple HTML document with head and body is exported
     * correctly.
     */
    @Test
    void simpleHtmlDocumentWithHeadAndBodyIsConvertedCorrectlyToString() {
        Html html = new Html();
        Head head = new Head();
        head.addElement(new Title("Hello, world!"));
        html.addElement(head);
        Body body = new Body();
        body.addElement(new P("Hello, world!"));
        html.addElement(body);
        assertEquals("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n  <head>\n    <title>Hello, world!</title>\n"
                + "  </head>\n  <body>\n    <p>Hello, world!</p>\n  </body>\n</html>", html.asString());
    }

    /**
     * Test verifying that a simple HTML document with body only is exported
     * correctly.
     */
    @Test
    void simpleHtmlDocumentWithBodyOnlyIsConvertedCorrectlyToString() {
        Html html = new Html();
        Body body = new Body();
        body.addElement(new P("Hello, world!"));
        html.addElement(body);
        assertEquals("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n  <body>\n    <p>Hello, world!</p>\n"
                + "  </body>\n</html>", html.asString());
    }

    /**
     * Test verifying that a simple HTML document with head only is exported
     * correctly.
     */
    @Test
    void simpleHtmlDocumentWithHeadOnlyIsConvertedCorrectlyToString() {
        Html html = new Html();
        Head head = new Head();
        head.addElement(new Title("Hello, world!"));
        html.addElement(head);
        assertEquals("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n  <head>\n    <title>Hello, world!</title>\n"
                + "  </head>\n</html>", html.asString());
    }
}
