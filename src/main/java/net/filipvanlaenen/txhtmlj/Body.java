package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithElements;

/**
 * A class representing a body.
 *
 * @see <a href=
 *      "https://html.spec.whatwg.org/multipage/sections.html#the-body-element">4.3.1
 *      The body element</a>
 */
public final class Body extends ElementWithElements implements XhtmlElement {
    /**
     * Adds flow content to the list of elements.
     *
     * @param flowContent
     *            The flow content to be added.
     */
    public void addElement(final FlowContent flowContent) {
        super.addElement(flowContent);
    }

    @Override
    public String getElementName() {
        return "body";
    }
}
