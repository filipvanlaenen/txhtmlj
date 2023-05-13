package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing a table head element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#the-thead-element">4.9.6 The thead element</a>
 */
public final class THead extends XhtmlElementWithElements<THead> implements XhtmlElement {
    /**
     * Adds a table row to the table head.
     *
     * @param tr The table row to be added.
     */
    public void addElement(final TR tr) {
        super.addElement(tr);
    }

    @Override
    public String getElementName() {
        return "thead";
    }
}
