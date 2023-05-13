package net.filipvanlaenen.txhtmlj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>XhtmlElementWithMixedContent</code> class.
 */
public class XhtmlElementWithMixedContentTest {
    /**
     * Local subclass of XhtmlElementWithContent for testing purposes.
     */
    private class MyXhtmlElementWithMixedContent extends XhtmlElementWithMixedContent<MyXhtmlElementWithMixedContent> {
        /**
         * Constructs an a element with a string as its content.
         *
         * @param content A string.
         */
        protected MyXhtmlElementWithMixedContent(final String content) {
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
        MyXhtmlElementWithMixedContent e = new MyXhtmlElementWithMixedContent("Bar").clazz("qux");
        assertEquals("<foo class=\"qux\">Bar</foo>", e.asString());
    }

    /**
     * Test verifying that a custom data attribute is exported correctly.
     */
    @Test
    void customDataShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithMixedContent e = new MyXhtmlElementWithMixedContent("Bar").data("qux", "baz");
        assertEquals("<foo data-qux=\"baz\">Bar</foo>", e.asString());
    }

    /**
     * Test verifying that onchange is exported correctly.
     */
    @Test
    void onchangeShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithMixedContent e = new MyXhtmlElementWithMixedContent("Bar").onchange("qux()");
        assertEquals("<foo onchange=\"qux()\">Bar</foo>", e.asString());
    }

    /**
     * Test verifying that onclick is exported correctly.
     */
    @Test
    void onclickShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithMixedContent e = new MyXhtmlElementWithMixedContent("Bar").onclick("qux()");
        assertEquals("<foo onclick=\"qux()\">Bar</foo>", e.asString());
    }

    /**
     * Test verifying that onload is exported correctly.
     */
    @Test
    void onloadShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithMixedContent e = new MyXhtmlElementWithMixedContent("Bar").onload("qux()");
        assertEquals("<foo onload=\"qux()\">Bar</foo>", e.asString());
    }
}
