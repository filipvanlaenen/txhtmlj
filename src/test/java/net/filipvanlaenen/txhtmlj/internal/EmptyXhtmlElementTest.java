package net.filipvanlaenen.txhtmlj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>EmptyXhtmlElement</code> class.
 */
public class EmptyXhtmlElementTest {
    /**
     * Local subclass of EmptyXhtmlElement for testing purposes.
     */
    private class MyEmptyXhtmlElement extends EmptyXhtmlElement<MyEmptyXhtmlElement> {
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
        MyEmptyXhtmlElement e = new MyEmptyXhtmlElement().clazz("qux");
        assertEquals("<foo class=\"qux\"/>", e.asString());
    }

    /**
     * Test verifying that a custom data attribute is exported correctly.
     */
    @Test
    void customDataShouldBeConvertedCorrectlyToString() {
        MyEmptyXhtmlElement e = new MyEmptyXhtmlElement().data("qux", "baz");
        assertEquals("<foo data-qux=\"baz\"/>", e.asString());
    }

    /**
     * Test verifying that onchange is exported correctly.
     */
    @Test
    void onchangeShouldBeConvertedCorrectlyToString() {
        MyEmptyXhtmlElement e = new MyEmptyXhtmlElement().onchange("qux()");
        assertEquals("<foo onchange=\"qux()\"/>", e.asString());
    }

    /**
     * Test verifying that onclick is exported correctly.
     */
    @Test
    void onclickShouldBeConvertedCorrectlyToString() {
        MyEmptyXhtmlElement e = new MyEmptyXhtmlElement().onclick("qux()");
        assertEquals("<foo onclick=\"qux()\"/>", e.asString());
    }

    /**
     * Test verifying that onload is exported correctly.
     */
    @Test
    void onloadShouldBeConvertedCorrectlyToString() {
        MyEmptyXhtmlElement e = new MyEmptyXhtmlElement().onload("qux()");
        assertEquals("<foo onload=\"qux()\"/>", e.asString());
    }
}
