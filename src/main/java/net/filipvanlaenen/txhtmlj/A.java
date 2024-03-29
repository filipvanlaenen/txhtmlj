package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing an a element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-a-element">4.5.1 The a element</a>
 */
public final class A extends XhtmlElementWithMixedContent<A> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public A() {
        super();
    }

    /**
     * Constructs an a element with a string as its content.
     *
     * @param content A string.
     */
    public A(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the a element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "a";
    }

    /**
     * Sets the hyperreference.
     *
     * @param href The hyperreference.
     * @return The instance called.
     */
    public A href(final String href) {
        addStringAttribute("href", href);
        return this;
    }
}
