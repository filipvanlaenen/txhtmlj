package net.filipvanlaenen.txhtmlj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>XhtmlElementWithContent</code> class.
 */
public class XhtmlElementWithContentTest {
    /**
     * Local subclass of XhtmlElementWithContent for testing purposes.
     */
    private class MyXhtmlElementWithContent extends XhtmlElementWithContent<MyXhtmlElementWithContent> {
        /**
         * Constructs an a element with a string as its content.
         *
         * @param content A string.
         */
        protected MyXhtmlElementWithContent(final String content) {
            super(content);
        }

        @Override
        public String getElementName() {
            return "foo";
        }
    }

    /**
     * Test verifying that a class is exported correctly.
     */
    @Test
    void classShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithContent e = new MyXhtmlElementWithContent("Bar").clazz("qux");
        assertEquals("<foo class=\"qux\">Bar</foo>", e.asString());
    }

    /**
     * Test verifying that a custom data attribute is exported correctly.
     */
    @Test
    void customDataShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithContent e = new MyXhtmlElementWithContent("Bar").data("qux", "baz");
        assertEquals("<foo data-qux=\"baz\">Bar</foo>", e.asString());
    }

    /**
     * Test verifying that onchange is exported correctly.
     */
    @Test
    void onchangeShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithContent e = new MyXhtmlElementWithContent("Bar").onchange("qux()");
        assertEquals("<foo onchange=\"qux()\">Bar</foo>", e.asString());
    }

    /**
     * Test verifying that onclick is exported correctly.
     */
    @Test
    void onclickShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithContent e = new MyXhtmlElementWithContent("Bar").onclick("qux()");
        assertEquals("<foo onclick=\"qux()\">Bar</foo>", e.asString());
    }

    /**
     * Test verifying that onload is exported correctly.
     */
    @Test
    void onloadShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithContent e = new MyXhtmlElementWithContent("Bar").onload("qux()");
        assertEquals("<foo onload=\"qux()\">Bar</foo>", e.asString());
    }

    /**
     * Test verifying that onmousemove is exported correctly.
     */
    @Test
    void onmousemoveShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithContent e = new MyXhtmlElementWithContent("Bar").onmousemove("bar()");
        assertEquals("<foo onmousemove=\"bar()\">Bar</foo>", e.asString());
    }

    /**
     * Test verifying that onmouseout is exported correctly.
     */
    @Test
    void onmouseoutShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithContent e = new MyXhtmlElementWithContent("Bar").onmouseout("bar()");
        assertEquals("<foo onmouseout=\"bar()\">Bar</foo>", e.asString());
    }

    /**
     * Test verifying that onmouseover is exported correctly.
     */
    @Test
    void onmouseoverShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithContent e = new MyXhtmlElementWithContent("Bar").onmouseover("bar()");
        assertEquals("<foo onmouseover=\"bar()\">Bar</foo>", e.asString());
    }
}
