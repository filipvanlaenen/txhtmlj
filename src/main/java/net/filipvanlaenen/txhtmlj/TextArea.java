package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithContent;

/**
 * A class representing a text area element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/form-elements.html#the-textarea-element">4.10.11 The textarea
 *      element</a>
 */
public final class TextArea extends XhtmlElementWithContent<TextArea> implements FlowContent, PhrasingContent {
    /**
     * Constructs a text area element with a string as its content.
     *
     * @param content A string.
     */
    public TextArea(final String content) {
        super(content);
    }

    /**
     * Sets the number of columns.
     *
     * @param cols The number of columns.
     * @return The instance called.
     */
    public TextArea cols(final Integer cols) {
        addNumericAttribute("cols", cols);
        return this;
    }

    @Override
    public String getElementName() {
        return "textarea";
    }

    /**
     * Sets the maximum length.
     *
     * @param maxlength The maximum length.
     * @return The instance called.
     */
    public TextArea maxlength(final Integer maxlength) {
        addNumericAttribute("maxlength", maxlength);
        return this;
    }

    /**
     * Sets the minimum length.
     *
     * @param minlength The minimum length.
     * @return The instance called.
     */
    public TextArea minlength(final Integer minlength) {
        addNumericAttribute("minlength", minlength);
        return this;
    }

    /**
     * Sets the name.
     *
     * @param name The name.
     * @return The instance called.
     */
    public TextArea name(final String name) {
        addStringAttribute("name", name);
        return this;
    }

    /**
     * Sets the number of rows.
     *
     * @param rows The number of rows.
     * @return The instance called.
     */
    public TextArea rows(final Integer rows) {
        addNumericAttribute("rows", rows);
        return this;
    }
}
