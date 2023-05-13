package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing an ul element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-ul-element">4.4.6 The ul element</a>
 */
public final class UL extends XhtmlElementWithElements<UL> implements FlowContent {
    /**
     * Adds an li element to the list of elements.
     *
     * @param li The li element to be added.
     */
    public void addElement(final LI li) {
        super.addElement(li);
    }

    @Override
    public String getElementName() {
        return "ul";
    }
}
