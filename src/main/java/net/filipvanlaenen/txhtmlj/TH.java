package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a table data header element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#the-th-element">4.9.10 The th element</a>
 */
public final class TH extends XhtmlElementWithMixedContent<TH> implements XhtmlElement {
    /**
     * Default constructor.
     */
    public TH() {
        super();
    }

    /**
     * Constructs an a element with a string as its content.
     *
     * @param content A string.
     */
    public TH(final String content) {
        super(content);
    }

    /**
     * Adds flow content to the table header cell.
     *
     * @param flowContent The flow content to be added.
     */
    public void addElement(final FlowContent flowContent) {
        super.addElement(flowContent);
    }

    @Override
    public String getElementName() {
        return "th";
    }
}
