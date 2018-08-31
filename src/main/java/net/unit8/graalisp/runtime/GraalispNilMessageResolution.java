package net.unit8.graalisp.runtime;

import com.oracle.truffle.api.interop.CanResolve;
import com.oracle.truffle.api.interop.MessageResolution;
import com.oracle.truffle.api.interop.Resolve;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.nodes.Node;
import net.unit8.graalisp.node.GraalispNode;

@MessageResolution(receiverType = GraalispNil.class)
public class GraalispNilMessageResolution {
    @Resolve(message = "IS_NULL")
    public abstract static class ForeignIsNilNode extends Node {
        public Object access(Object receiver) {
            return GraalispNil.SINGLETON == receiver;
        }
    }

    @CanResolve
    public abstract static class CheckNil extends Node {

        protected static boolean test(TruffleObject receiver) {
            return receiver instanceof GraalispNil;
        }
    }
}
