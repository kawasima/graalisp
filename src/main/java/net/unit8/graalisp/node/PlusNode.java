package net.unit8.graalisp.node;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "+")
@NodeChildren({@NodeChild("leftNode"), @NodeChild("rightNode")})
public class PlusNode extends GraalispNode {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return null;
    }

    @Specialization(rewriteOn = ArithmeticException.class)
    protected long add(long left, long right) {
        return Math.addExact(left, right);
    }
}
