package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.bltxmlepj.EmptyElement;

/**
 * A class representing an HR element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-hr-element">4.4.2 The hr element</a>.
 */
public final class HR extends EmptyElement implements FlowContent {
    @Override
    public String getElementName() {
        return "hr";
    }
}
