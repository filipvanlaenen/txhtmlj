package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndMixedContent;

/**
 * A class representing a div element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-div-element">4.4.15 The div
 *      element</a>
 */
public final class Div extends ElementWithAttributesAndMixedContent implements FlowContent {
    /**
     * Default constructor.
     */
    public Div() {
        super();
    }

    /**
     * Constructs an a element with a string as its content.
     *
     * @param content A string.
     */
    public Div(final String content) {
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
        return "div";
    }

    /**
     * Sets the class.
     *
     * @param clazz The class.
     * @return The instance called.
     */
    public Div clazz(final String clazz) {
        addStringAttribute("class", clazz);
        return this;
    }
}
