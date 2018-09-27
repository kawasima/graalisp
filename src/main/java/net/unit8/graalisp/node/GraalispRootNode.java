package net.unit8.graalisp.node;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;

@NodeInfo
public class GraalispRootNode extends RootNode {
    @Child
    private GraalispNode bodyNode;

    public GraalispRootNode(TruffleLanguage<?> language, FrameDescriptor frameDescriptor, GraalispNode bodyNode) {
        super(language, frameDescriptor);
    }

    public Object execute(VirtualFrame frame) {
        return bodyNode.executeGeneric(frame);
    }
}
