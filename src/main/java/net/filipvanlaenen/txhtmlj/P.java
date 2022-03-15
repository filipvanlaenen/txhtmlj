package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithContent;

/**
 * A class representing a paragraph.
 *
 * @see <a href=
 *      "https://html.spec.whatwg.org/multipage/grouping-content.html#the-p-element">4.4.1
 *      The p element</a>
 */
public final class P extends ElementWithContent implements FlowContent {
    /**
     * Constructs a p element with a string as its content.
     *
     * @param content
     *            A string.
     */
    public P(final String content) {
        super(content);
    }

    @Override
    public String getElementName() {
        return "p";
    }
}
