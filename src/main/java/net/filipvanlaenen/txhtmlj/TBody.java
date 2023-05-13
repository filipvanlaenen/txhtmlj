package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing a table body element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#the-tbody-element">4.9.5 The tbody element</a>
 */
public final class TBody extends XhtmlElementWithElements<TBody> implements XhtmlElement {
    /**
     * Adds a table row to the table body.
     *
     * @param tr The table row to be added.
     */
    public void addElement(final TR tr) {
        super.addElement(tr);
    }

    @Override
    public String getElementName() {
        return "tbody";
    }
}
