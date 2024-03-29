package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.EmptyXhtmlElement;

/**
 * A class representing a line break element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-br-element">4.5.27 The br
 *      element</a>.
 */
public final class BR extends EmptyXhtmlElement<BR> implements FlowContent, PhrasingContent {
    @Override
    public String getElementName() {
        return "br";
    }
}
