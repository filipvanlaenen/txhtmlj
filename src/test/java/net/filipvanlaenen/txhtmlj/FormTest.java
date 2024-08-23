package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Form</code> class.
 */
public class FormTest {
    /**
     * Test verifying that a simple form with some labels and input fields is exported correctly.
     */
    @Test
    void simpleFormWithSomeLabelsAndInputFieldsConvertedCorrectlyToString() {
        Form form = new Form().action("foo.php").method(MethodValue.POST);
        form.addElement(new Label("Foo: "));
        form.addElement(new Input().name("field1").type(TypeValue.TEXT));
        form.addElement(new Input().value("Submit").type(TypeValue.SUBMIT));
        String expected = "<form action=\"foo.php\" method=\"post\">\n" + "  <label>Foo: </label>\n"
                + "  <input name=\"field1\" type=\"text\"/>\n" + "  <input type=\"submit\" value=\"Submit\"/>\n"
                + "</form>";
        assertEquals(expected, form.asString());
    }
}
