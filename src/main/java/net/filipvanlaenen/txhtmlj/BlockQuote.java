package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a block quotation.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-blockquote-element">4.4.4 The
 *      blockquote element</a>
 */
public final class BlockQuote extends XhtmlElementWithMixedContent<BlockQuote> implements FlowContent {
    /**
     * Default constructor.
     */
    public BlockQuote() {
        super();
    }

    /**
     * Constructs a blockquote element with a string as its content.
     *
     * @param content A string.
     */
    public BlockQuote(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the block quotation.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "blockquote";
    }
}
