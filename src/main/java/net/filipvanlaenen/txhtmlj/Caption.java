package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing an caption element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#the-caption-element">4.9.2 The caption element</a>
 */
public final class Caption extends XhtmlElementWithMixedContent<Caption> {
    /**
     * Default constructor.
     */
    public Caption() {
        super();
    }

    /**
     * Constructs an a element with a string as its content.
     *
     * @param content A string.
     */
    public Caption(final String content) {
        super(content);
    }

    /**
     * Adds flow content to the a element.
     *
     * @param flowContent The flow content to be added.
     */
    public void addElement(final FlowContent flowContent) {
        super.addElement(flowContent);
    }

    @Override
    public String getElementName() {
        return "caption";
    }
}
