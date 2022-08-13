package net.filipvanlaenen.txhtmlj;

/**
 * A class representing an svg element in a XHTML document. It wraps around an svg element from TSVGJ.
 *
 * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content-other.html#svg-0">4.8.16 SVG</a>
 */
public final class Svg implements FlowContent {
    /**
     * The wrapped svg element from TSVGJ.
     */
    private final net.filipvanlaenen.tsvgj.Svg svg;

    /**
     * Default constructor.
     */
    public Svg() {
        svg = new net.filipvanlaenen.tsvgj.Svg(false);
    }

    @Override
    public String asString(final String indent) {
        return svg.asString(indent);
    }

    @Override
    public String getElementName() {
        return "svg";
    }

    /**
     * Returns the wrapped svg element from TSVGJ.
     *
     * @return The wrapped svg element from TSVGJ.
     */
    public net.filipvanlaenen.tsvgj.Svg getSvg() {
        return svg;
    }
}
