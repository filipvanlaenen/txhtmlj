package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing a dl element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-dl-element">4.4.9 The dl element</a>
 */
public final class DL extends XhtmlElementWithElements<DL> implements FlowContent {
    /**
     * Adds a dd element to the list of elements.
     *
     * @param dd The dd element to be added.
     */
    public void addElement(final DD dd) {
        super.addElement(dd);
    }

    /**
     * Adds a dt element to the list of elements.
     *
     * @param dt The dt element to be added.
     */
    public void addElement(final DT dt) {
        super.addElement(dt);
    }

    @Override
    public String getElementName() {
        return "dl";
    }
}
