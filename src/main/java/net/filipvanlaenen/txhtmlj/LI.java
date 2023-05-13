package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing an li element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-li-element">4.4.8 The li element</a>
 */
public final class LI extends XhtmlElementWithMixedContent<LI> {
    /**
     * Default constructor.
     */
    public LI() {
        super();
    }

    /**
     * Constructs an li element with a string as its content.
     *
     * @param content A string.
     */
    public LI(final String content) {
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
        return "li";
    }
}
