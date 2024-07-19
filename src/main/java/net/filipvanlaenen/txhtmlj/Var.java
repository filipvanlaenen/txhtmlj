package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a var element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-var-element">4.5.16 The var
 *      element</a>
 */
public final class Var extends XhtmlElementWithMixedContent<Var> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public Var() {
        super();
    }

    /**
     * Constructs a var element with a string as its content.
     *
     * @param content A string.
     */
    public Var(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the var element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "var";
    }
}
