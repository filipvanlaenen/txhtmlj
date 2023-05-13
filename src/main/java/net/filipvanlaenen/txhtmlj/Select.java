package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing a select element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/form-elements.html#the-select-element">4.10.7 The select
 *      element</a>
 */
public final class Select extends XhtmlElementWithElements<Select> implements FlowContent, PhrasingContent {
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
}
