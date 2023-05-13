package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing a table row element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#the-tr-element">4.9.8 The tr element</a>
 */
public final class TR extends XhtmlElementWithElements<TR> implements XhtmlElement {
    /**
     * Adds a table data cell to the table row.
     *
     * @param td The table data cell to be added.
     */
    public void addElement(final TD td) {
        super.addElement(td);
    }

    /**
     * Adds a table header cell to the table row.
     *
     * @param th The table header cell to be added.
     */
    public void addElement(final TH th) {
        super.addElement(th);
    }

    @Override
    public String getElementName() {
        return "tr";
    }
}
