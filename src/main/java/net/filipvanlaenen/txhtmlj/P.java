package net.filipvanlaenen.txhtmlj;

/**
 * A class representing a paragraph.
 *
 * @see <a href=
 *      "https://html.spec.whatwg.org/multipage/grouping-content.html#the-p-element">4.4.1
 *      The p element</a>
 */
public class P implements XhtmlElement {
    /**
     * The content.
     */
    private final String content;

    public P(String content) {
        this.content = content;
    }

    @Override
    public String asString(String indent) {
        return indent + "<p>" + content + "</p>";
    }
}
