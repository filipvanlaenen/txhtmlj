package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.kolektoj.Collection;
import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a button element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/form-elements.html#the-button-element">4.10.6 The button
 *      element</a>
 */
public final class Button extends XhtmlElementWithMixedContent<Button> implements FlowContent, PhrasingContent {
    /**
     * The type values allowed for the button element.
     */
    private static final Collection<TypeValue> ALLOWED_TYPE_VALUES =
            Collection.of(TypeValue.BUTTON, TypeValue.RESET, TypeValue.SUBMIT);

    /**
     * Default constructor.
     */
    public Button() {
        super();
    }

    /**
     * Constructs a button element with a string as its content.
     *
     * @param content A string.
     */
    public Button(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the button element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "button";
    }

    /**
     * Sets the type.
     *
     * @param type The type value.
     * @return The instance called.
     */
    public Button type(final TypeValue type) {
        if (!ALLOWED_TYPE_VALUES.contains(type)) {
            throw new IllegalArgumentException("The type value " + type + " is not allowed for button elements.");
        }
        addEnumerationAttribute("type", type);
        return this;
    }
}
