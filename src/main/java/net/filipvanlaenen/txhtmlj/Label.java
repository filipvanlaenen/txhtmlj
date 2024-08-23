package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithMixedContent;

/**
 * A class representing a label element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#the-label-element">4.10.4 The label element</a>
 */
public final class Label extends XhtmlElementWithMixedContent<Label> implements FlowContent, PhrasingContent {
    /**
     * Default constructor.
     */
    public Label() {
        super();
    }

    /**
     * Constructs an label element with a string as its content.
     *
     * @param content A string.
     */
    public Label(final String content) {
        super(content);
    }

    /**
     * Adds phrasing content to the label element.
     *
     * @param phrasingContent The phrasing content to be added.
     */
    public void addElement(final PhrasingContent phrasingContent) {
        super.addElement(phrasingContent);
    }

    @Override
    public String getElementName() {
        return "label";
    }
}
