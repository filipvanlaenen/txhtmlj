package net.filipvanlaenen.txhtmlj;

/**
 * A class representing an HTML document.
 *
 * @see <a href=
 *      "https://html.spec.whatwg.org/multipage/semantics.html#the-html-element">4.1.1
 *      The html element</a>
 */
public final class Html implements XhtmlElement {
    /**
     * The body.
     */
    private Body body;
    /**
     * The head.
     */
    private Head head;

    /**
     * Adds a body.
     *
     * @param theBody
     *            The body.
     */
    public void addElement(final Body theBody) {
        this.body = theBody;
    }

    /**
     * Adds a head.
     *
     * @param theHead
     *            The head.
     */
    public void addElement(final Head theHead) {
        this.head = theHead;
    }

    /**
     * Returns a string representation of the HTML document.
     *
     * @param indent
     *            The indentation.
     * @return A string representation of the SVG document.
     */
    public String asString(final String indent) {
        return indent + "<" + getElementName() + " xmlns=\"http://www.w3.org/1999/xhtml\""
                + (head == null && body == null ? "/>"
                        : ">\n" + (head != null ? head.asString(indent + "  ") + "\n" : "")
                                + (body != null ? body.asString(indent + "  ") + "\n" : "") + indent + "</"
                                + getElementName() + ">");
    }

    @Override
    public String getElementName() {
        return "html";
    }
}
