package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing an option element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/form-elements.html#the-option-element">4.10.10 The option
 *      element</a>
 */
public final class Option extends XhtmlElementWithMixedContent<Option> {
    /**
     * Default constructor.
     */
    public Option() {
        super();
    }

    /**
     * Constructs an a element with a string as its content.
     *
     * @param content A string.
     */
    public Option(final String content) {
        super(content);
    }

    /**
     * Adds span element to the option.
     *
     * @param span The span element to be added.
     */
    public void addElement(final Span span) {
        super.addElement(span);
    }

    @Override
    public String getElementName() {
        return "option";
    }

    /**
     * Sets the value.
     *
     * @param value The value.
     * @return The instance called.
     */
    public Option value(final String value) {
        addStringAttribute("value", value);
        return this;
    }
}
