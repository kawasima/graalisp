package net.unit8.graalisp.node;

import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.unit8.graalisp.GraalispTypes;
import net.unit8.graalisp.GraalispTypesGen;

@TypeSystemReference(GraalispTypes.class)
@NodeInfo
public abstract class GraalispNode extends Node {
    private static final int NO_SOURCE = -1;
    private static final int UNAVAILABLE_SOURCE = -2;

    private int sourceCharIndex = NO_SOURCE;
    private int sourceLength;

    public abstract Object executeGeneric(VirtualFrame frame);

    public Object executeGeneric() {
        return null;
    }

    public long executeLong(VirtualFrame frame) {
        return GraalispTypesGen.asLong(executeGeneric(frame));
    }

    public boolean executeBoolean(VirtualFrame frame) {
        return GraalispTypesGen.asBoolean(executeGeneric(frame));
    }
}
