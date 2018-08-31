package net.unit8.graalisp.node.local;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.profiles.BranchProfile;
import net.unit8.graalisp.node.GraalispNode;
import net.unit8.graalisp.runtime.GraalispNil;

public class ReadArgumentNode extends GraalispNode {
    private final int index;

    /**
     * Profiling information, collected by the interpreter, capturing whether the function was
     * called with fewer actual arguments than formal arguments.
     */
    private final BranchProfile outOfBoundsTaken = BranchProfile.create();

    public ReadArgumentNode(int index) {
        this.index = index;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object[] args = frame.getArguments();
        if (index < args.length) {
            return args[index];
        } else {
            /* In the interpreter, record profiling information that the branch was used. */
            outOfBoundsTaken.enter();
            /* Use the default null value. */
            return GraalispNil.SINGLETON;
        }
    }
}
