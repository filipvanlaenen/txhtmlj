package net.filipvanlaenen.txhtmlj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>XhtmlElementWithElements</code> class.
 */
public class XhtmlElementWithElementsTest {
    /**
     * Local subclass of XhtmlElementWithElements for testing purposes.
     */
    private class MyXhtmlElementWithElements extends XhtmlElementWithElements<MyXhtmlElementWithElements> {
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
        MyXhtmlElementWithElements e = new MyXhtmlElementWithElements().clazz("qux");
        assertEquals("<foo class=\"qux\"/>", e.asString());
    }

    /**
     * Test verifying that a custom data attribute is exported correctly.
     */
    @Test
    void customDataShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithElements e = new MyXhtmlElementWithElements().data("qux", "baz");
        assertEquals("<foo data-qux=\"baz\"/>", e.asString());
    }

    /**
     * Test verifying that onchange is exported correctly.
     */
    @Test
    void onchangeShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithElements e = new MyXhtmlElementWithElements().onchange("qux()");
        assertEquals("<foo onchange=\"qux()\"/>", e.asString());
    }

    /**
     * Test verifying that onclick is exported correctly.
     */
    @Test
    void onclickShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithElements e = new MyXhtmlElementWithElements().onclick("qux()");
        assertEquals("<foo onclick=\"qux()\"/>", e.asString());
    }

    /**
     * Test verifying that onload is exported correctly.
     */
    @Test
    void onloadShouldBeConvertedCorrectlyToString() {
        MyXhtmlElementWithElements e = new MyXhtmlElementWithElements().onload("qux()");
        assertEquals("<foo onload=\"qux()\"/>", e.asString());
    }
}
