package net.filipvanlaenen.txhtmlj;

import net.filipvanlaenen.txhtmlj.internal.XhtmlElementWithElements;

/**
 * A class representing a form element.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#the-form-element">4.10.3 The form element</a>
 */
public final class Form extends XhtmlElementWithElements<Form> implements FlowContent {
    /**
     * Sets the URL for the form submission.
     *
     * @param action The URL for the form submission.
     * @return The instance called.
     */
    public Form action(final String action) {
        addStringAttribute("action", action);
        return this;
    }

    /**
     * Adds flow content to the a element.
     *
     * @param flowContent The flow content to be added.
     */
    public void addElement(final FlowContent flowContent) {
        super.addElement(flowContent);
    }

    @Override
    public String getElementName() {
        return "form";
    }

    /**
     * Sets the method.
     *
     * @param method The method value.
     * @return The instance called.
     */
    public Form method(final MethodValue method) {
        addEnumerationAttribute("method", method);
        return this;
    }
}
