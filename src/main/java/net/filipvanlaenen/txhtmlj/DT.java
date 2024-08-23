package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a dt element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-dt-element">4.4.10 The dt element</a>
 */
public final class DT extends XhtmlElementWithMixedContent<DT> {
    /**
     * Default constructor.
     */
    public DT() {
        super();
    }

    /**
     * Constructs a dt element with a string as its content.
     *
     * @param content A string.
     */
    public DT(final String content) {
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
        return "dt";
    }
}
