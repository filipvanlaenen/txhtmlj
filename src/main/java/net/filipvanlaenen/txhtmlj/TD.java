package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndMixedContent;

/**
 * A class representing a table data cell element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#the-td-element">4.9.9 The td element</a>
 */
public final class TD extends ElementWithAttributesAndMixedContent implements XhtmlElement {
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

    /**
     * Sets the class.
     *
     * @param clazz The class.
     * @return The instance called.
     */
    public TD clazz(final String clazz) {
        addStringAttribute("class", clazz);
        return this;
    }

    @Override
    public String getElementName() {
        return "td";
    }
}
