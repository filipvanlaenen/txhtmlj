package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing a menu element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-menu-element">4.4.7 The menu
 *      element</a>
 */
public final class Menu extends XhtmlElementWithElements<Menu> implements FlowContent {
    /**
     * Adds an li element to the menu.
     *
     * @param li The li element to be added.
     */
    public void addElement(final LI li) {
        super.addElement(li);
    }

    @Override
    public String getElementName() {
        return "menu";
    }
}
