package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndElements;

/**
 * A class representing a table row element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#the-tr-element">4.9.8 The tr element</a>
 */
public final class TR extends ElementWithAttributesAndElements implements XhtmlElement {
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

    /**
     * Adds a custom data attribute to the table row.
     *
     * @param name  The name of the custom data attribute.
     * @param value The value of the custom data attribute.
     * @return The instance called.
     */
    public TR data(final String name, final String value) {
        addStringAttribute("data-" + name, value);
        return this;
    }

    @Override
    public String getElementName() {
        return "tr";
    }
}
