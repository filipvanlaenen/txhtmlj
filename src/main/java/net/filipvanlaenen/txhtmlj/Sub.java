package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a sub element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-sub-and-sup-elements">4.5.19 The
 *      sub and sup elements</a>
 */
public final class Sub extends XhtmlElementWithMixedContent<Sub> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public Sub() {
        super();
    }

    /**
     * Constructs a sub element with a string as its content.
     *
     * @param content A string.
     */
    public Sub(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the sub element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "sub";
    }
}
