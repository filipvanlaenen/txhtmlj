package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndContent;

public class A extends ElementWithAttributesAndContent implements FlowContent {
    /**
     * Constructs an a element with a string as its content.
     *
     * @param content
     *            A string.
     */
    public A(final String content) {
        super(content);
    }

    @Override
    public String getElementName() {
        return "a";
    }

    public A href(String string) {
        addStringAttribute("href", string);
        return this;
    }
}
