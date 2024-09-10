package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing a table element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#the-table-element">4.9.1 The table element</a>
 */
public final class Table extends XhtmlElementWithElements<Table> implements FlowContent {
    /**
     * Adds a caption to the table.
     *
     * @param caption The caption to be added.
     */
    public void addElement(final Caption caption) {
        super.addElement(caption);
    }

    /**
     * Adds a table body to the table.
     *
     * @param tBody The table body to be added.
     */
    public void addElement(final TBody tBody) {
        super.addElement(tBody);
    }

    /**
     * Adds a table head to the table.
     *
     * @param tHead The table head to be added.
     */
    public void addElement(final THead tHead) {
        super.addElement(tHead);
    }

    @Override
    public String getElementName() {
        return "table";
    }
}
