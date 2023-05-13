package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a table data cell element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#the-td-element">4.9.9 The td element</a>
 */
public final class TD extends XhtmlElementWithMixedContent<TD> implements XhtmlElement {
    /**
     * Default constructor.
     */
    public TD() {
        super();
    }

    /**
     * Constructs an a element with a string as its content.
     *
     * @param content A string.
     */
    public TD(final String content) {
        super(content);
    }

    /**
     * Adds flow content to the table data cell.
     *
     * @param flowContent The flow content to be added.
     */
    public void addElement(final FlowContent flowContent) {
        super.addElement(flowContent);
    }

    @Override
    public String getElementName() {
        return "td";
    }
}
