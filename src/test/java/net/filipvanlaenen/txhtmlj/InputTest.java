package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Input</code> class.
 */
public class InputTest {
    /**
     * Test verifying that a simple text input field is exported correctly.
     */
    @Test
    void simpleTextInputFieldConvertedCorrectlyToString() {
        Input input = new Input().name("field1").type(TypeValue.TEXT);
        assertEquals("<input name=\"field1\" type=\"text\"/>", input.asString());
    }

    /**
     * Test verifying that a simple submit input field is exported correctly.
     */
    @Test
    void simpleSubmitInputConvertedCorrectlyToString() {
        Input input = new Input().value("Submit").type(TypeValue.SUBMIT);
        assertEquals("<input type=\"submit\" value=\"Submit\"/>", input.asString());
    }
}
