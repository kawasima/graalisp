package net.unit8.graalisp;

import com.oracle.truffle.api.frame.FrameDescriptor;
import net.unit8.graalisp.node.GraalispNode;
import net.unit8.graalisp.node.GraalispRootNode;
import net.unit8.graalisp.parser.GraalispBaseListener;

public class GraalispParseTreeListener extends GraalispBaseListener {
    private GraalispNode node;
    public GraalispRootNode getRoot(GraalispLanguage language) {
        return new GraalispRootNode(language, new FrameDescriptor(), null);
    }
}
