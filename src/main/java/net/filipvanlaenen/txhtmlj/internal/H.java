package net.filipvanlaenen.txhtmlj.internal;

import net.filipvanlaenen.bltxmlepj.ElementWithContent;
import net.filipvanlaenen.txhtmlj.FlowContent;

/**
 * Abstract superclass for the heading elements.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">4.3.6 The
 *      h1, h2, h3, h4, h5, and h6 elements</a>
 */
public abstract class H extends ElementWithContent implements FlowContent {
    /**
     * Constructs a heading element with a string as its content.
     *
     * @param content A string.
     */
    protected H(final String content) {
        super(content);
    }

    @Override
    public final String getElementName() {
        return "h" + getLevel();
    }

    /**
     * Returns the level of the heading.
     *
     * @return The level of the heading.
     */
    protected abstract int getLevel();
}
