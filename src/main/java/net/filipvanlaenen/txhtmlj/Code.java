package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a code element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-code-element">4.5.15 The code
 *      element</a>
 */
public final class Code extends XhtmlElementWithMixedContent<Code> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public Code() {
        super();
    }

    /**
     * Constructs a code element with a string as its content.
     *
     * @param content A string.
     */
    public Code(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the code element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "code";
    }
}
