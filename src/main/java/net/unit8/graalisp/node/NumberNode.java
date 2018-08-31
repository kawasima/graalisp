package net.unit8.graalisp.node;

import com.oracle.truffle.api.frame.VirtualFrame;

public class NumberNode extends GraalispNode {
    public final long value;

    public NumberNode(long value) {
        this.value = value;
    }

    @Override
    public long executeLong(VirtualFrame virtualFrame) {
        return value;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return value;
    }

    @Override
    public String toString() {
        return Long.toString(value);
    }
}
