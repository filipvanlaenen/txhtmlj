package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Button</code> class.
 */
public class ButtonTest {
    /**
     * Test verifying that a simple submit button with text is exported correctly.
     */
    @Test
    void simpleSubmitButtonWithTextIsConvertedCorrectlyToString() {
        Button button = new Button("Foo").type(TypeValue.SUBMIT);
        assertEquals("<button type=\"submit\">Foo</button>", button.asString());
    }

    /**
     * Test verifying that a simple submit button with a span element is exported correctly.
     */
    @Test
    void simpleSubmitButtonWithSpanIsConvertedCorrectlyToString() {
        Button button = new Button().type(TypeValue.SUBMIT);
        button.addElement(new Span("Foo"));
        assertEquals("<button type=\"submit\">\n  <span>Foo</span>\n</button>", button.asString());
    }

    /**
     * Test verifying that an exception is thrown when the wrong type is used for the button.
     */
    @Test
    void typeThrowsIllegalArgumentExceptionWhenWrongTypeIsUsed() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Button().type(TypeValue.CHECKBOX);
        });
        assertEquals("The type value CHECKBOX is not allowed for button elements.", exception.getMessage());
    }
}
