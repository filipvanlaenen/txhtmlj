package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing an ol element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-ol-element">4.4.5 The ol element</a>
 */
public final class OL extends XhtmlElementWithElements<OL> implements FlowContent {
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
        return "ol";
    }
}
