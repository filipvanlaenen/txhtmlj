package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a dd element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-dd-element">4.4.11 The dd element</a>
 */
public final class DD extends XhtmlElementWithMixedContent<DD> {
    /**
     * Default constructor.
     */
    public DD() {
        super();
    }

    /**
     * Constructs a dd element with a string as its content.
     *
     * @param content A string.
     */
    public DD(final String content) {
        super(content);
    }

    /**
     * Adds flow content to the list of elements.
     *
     * @param flowContent The flow content to be added.
     */
    public void addElement(final FlowContent flowContent) {
        super.addElement(flowContent);
    }

    @Override
    public String getElementName() {
        return "dd";
    }
}
