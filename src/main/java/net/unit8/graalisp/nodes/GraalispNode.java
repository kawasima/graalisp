package net.unit8.graalisp.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

@NodeInfo
public abstract class GraalispNode extends Node {
    public abstract Object executeGeneric(VirtualFrame frame);

    public Object executeGeneric() {
        return null;
    }
}
