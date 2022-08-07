package net.filipvanlaenen.txhtmlj;

/**
 * A class representing an svg element in a XHTML document.
 */
public final class Svg implements FlowContent {
    private final net.filipvanlaenen.tsvgj.Svg svg;

    /**
     * Default constructor.
     */
    public Svg() {
        svg = new net.filipvanlaenen.tsvgj.Svg(false);
    }

    @Override
    public String asString(String indent) {
        return svg.asString(indent);
    }

    @Override
    public String getElementName() {
        return "svg";
    }
    
    public net.filipvanlaenen.tsvgj.Svg getSvg() {
        return svg;
    }
}
