package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndMixedContent;

/**
 * A class representing a table data header element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#the-th-element">4.9.10 The th element</a>
 */
public final class TH extends ElementWithAttributesAndMixedContent implements XhtmlElement {
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

    /**
     * Sets the class.
     *
     * @param clazz The class.
     * @return The instance called.
     */
    public TH clazz(final String clazz) {
        addStringAttribute("class", clazz);
        return this;
    }

    @Override
    public String getElementName() {
        return "th";
    }
}
