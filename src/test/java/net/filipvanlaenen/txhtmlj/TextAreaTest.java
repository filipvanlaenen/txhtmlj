package net.filipvanlaenen.txhtmlj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>TextArea</code> class.
 */
public class TextAreaTest {
    /**
     * The magic number five.
     */
    private static final int FIVE = 5;
    /**
     * The magic number eighty.
     */
    private static final int EIGHTY = 80;
    /**
     * The magic number two hundred.
     */
    private static final int TWO_HUNDRED = 200;

    /**
     * Test verifying that a simple text area with a content and a name is exported correctly.
     */
    @Test
    public void shouldExportTextAreaWithContentAndNameCorrectlyToString() {
        TextArea textArea = new TextArea("Foo").name("foo");
        assertEquals("<textarea name=\"foo\">Foo</textarea>", textArea.asString());
    }

    /**
     * Test verifying that a simple text area with a name and cols is exported correctly.
     */
    @Test
    public void shouldExportTextAreaWithColsAndNameCorrectlyToString() {
        TextArea textArea = new TextArea("Foo").cols(EIGHTY).name("foo");
        assertEquals("<textarea cols=\"80\" name=\"foo\">Foo</textarea>", textArea.asString());
    }

    /**
     * Test verifying that a simple text area with a name, cols and maxlength is exported correctly.
     */
    @Test
    public void shouldExportTextAreaWithColsNameAndMaxLengthCorrectlyToString() {
        TextArea textArea = new TextArea("Foo").cols(EIGHTY).maxlength(TWO_HUNDRED).name("foo");
        assertEquals("<textarea cols=\"80\" maxlength=\"200\" name=\"foo\">Foo</textarea>", textArea.asString());
    }

    /**
     * Test verifying that a simple text area with a name, cols and minlength is exported correctly.
     */
    @Test
    public void shouldExportTextAreaWithColsNameAndMinLengthCorrectlyToString() {
        TextArea textArea = new TextArea("Foo").cols(EIGHTY).minlength(TWO_HUNDRED).name("foo");
        assertEquals("<textarea cols=\"80\" minlength=\"200\" name=\"foo\">Foo</textarea>", textArea.asString());
    }

    /**
     * Test verifying that a simple text area with a name, cols and rows is exported correctly.
     */
    @Test
    public void shouldExportTextAreaWithColsNameAndRowsCorrectlyToString() {
        TextArea textArea = new TextArea("Foo").cols(EIGHTY).name("foo").rows(FIVE);
        assertEquals("<textarea cols=\"80\" name=\"foo\" rows=\"5\">Foo</textarea>", textArea.asString());
    }
}
