package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing a footer element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/sections.html#the-footer-element">4.3.9 The footer element</a>
 */
public final class Footer extends XhtmlElementWithElements<Footer> implements FlowContent {
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
        return "footer";
    }
}
