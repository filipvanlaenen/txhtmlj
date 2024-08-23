package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Label</code> class.
 */
public class LabelTest {
    /**
     * Test verifying that simple label is exported correctly.
     */
    @Test
    void simpleLabelWithTextIsConvertedCorrectlyToString() {
        Label label = new Label("Foo: ");
        assertEquals("<label>Foo: </label>", label.asString());
    }

    /**
     * Test verifying that label with a span element is exported correctly.
     */
    @Test
    void simpleLabelWithSpanIsConvertedCorrectlyToString() {
        Label label = new Label();
        label.addElement(new Span("Foo"));
        label.addContent(": ");
        assertEquals("<label><span>Foo</span>: </label>", label.asString());
    }
}
