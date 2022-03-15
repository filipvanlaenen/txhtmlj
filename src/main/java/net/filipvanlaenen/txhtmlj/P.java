package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.ElementWithContent;

/**
 * A class representing a paragraph.
 *
 * @see <a href=
 *      "https://html.spec.whatwg.org/multipage/grouping-content.html#the-p-element">4.4.1
 *      The p element</a>
 */
public class P extends ElementWithContent implements XhtmlElement {
    public P(String content) {
        super(content);
    }

    @Override
    protected String getElementName() {
        return "p";
    }
}
