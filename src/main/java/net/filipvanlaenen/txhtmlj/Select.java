package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndElements;

/**
 * A class representing a select element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/form-elements.html#the-select-element">4.10.7 The select
 *      element</a>
 */
public final class Select extends ElementWithAttributesAndElements implements FlowContent {
    /**
     * Adds an option to the list of elements.
     *
     * @param option The option to be added.
     */
    public void addElement(final Option option) {
        super.addElement(option);
    }

    @Override
    public String getElementName() {
        return "select";
    }

    /**
     * Sets the ID.
     *
     * @param id The ID.
     * @return The instance called.
     */
    public Select id(final String id) {
        addStringAttribute("id", id);
        return this;
    }

    /**
     * Sets the onchange event.
     *
     * @param onchange The onchange event.
     * @return The instance called.
     */
    public Select onchange(final String onchange) {
        addStringAttribute("onchange", onchange);
        return this;
    }
}
