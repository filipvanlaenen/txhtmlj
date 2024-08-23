package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.EmptyXhtmlElement;

/**
 * A class representing an input element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/input.html#the-input-element">4.10.5 The input element</a>.
 */
public final class Input extends EmptyXhtmlElement<Input> implements FlowContent, PhrasingContent {
    @Override
    public String getElementName() {
        return "input";
    }

    /**
     * Sets the name.
     *
     * @param name The name.
     * @return The instance called.
     */
    public Input name(final String name) {
        addStringAttribute("name", name);
        return this;
    }

    /**
     * Sets the type.
     *
     * @param type The type value.
     * @return The instance called.
     */
    public Input type(final TypeValue type) {
        addEnumerationAttribute("type", type);
        return this;
    }

    /**
     * Sets the value.
     *
     * @param value The value.
     * @return The instance called.
     */
    public Input value(final String value) {
        addStringAttribute("value", value);
        return this;
    }
}
